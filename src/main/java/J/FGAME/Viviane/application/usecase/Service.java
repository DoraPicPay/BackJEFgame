package J.FGAME.Viviane.application.usecase;

import J.FGAME.Viviane.adpater.repository.Repository;
import J.FGAME.Viviane.adpater.repository.RepositoryPhrases;
import J.FGAME.Viviane.application.domain.Collection;
import J.FGAME.Viviane.application.domain.CollectionPhrases;
import J.FGAME.Viviane.application.domain.Informations;
import J.FGAME.Viviane.application.usecase.Methods.MapperClass;
import J.FGAME.Viviane.application.usecase.Methods.MapperJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.InputMismatchException;
import java.util.Optional;

@org.springframework.stereotype.Service
public class Service {

    MapperJson mapperJS;

    @Autowired
    Repository repository;

    @Autowired
    RepositoryPhrases repoPhrases;

    public Object Register(Informations info){
        try{
            var verificacao = repository.findById(info.getEmail());
            if(verificacao.isPresent()){
                return new ResponseEntity<>("5", HttpStatus.CONFLICT);
            }
            else{
                Collection newClient = new Collection(info.getEmail(), info.getName(), info.getPassword(), info.getScore(), info.isAcessoUnico(), info.getAcesso());
                newClient.setAcessoUnico(true);
                repository.save(newClient);
                return new ResponseEntity<>("1", HttpStatus.CREATED);
            }
        }catch(InputMismatchException imm){
            imm.printStackTrace();
            return new ResponseEntity<>("0", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public Object Login(Informations info){
        try{
            var verificacao = repository.findById(info.getEmail());
            if(verificacao.isPresent()){
                Collection clientInfo = verificacao.get();
                if(info.getPassword().equals(clientInfo.getPassword())){
                    clientInfo.setAcesso(clientInfo.getAcesso() + 1);
                    clientInfo.setAcessoUnico(false);
                    repository.save(clientInfo);
                    return new ResponseEntity<>("1", HttpStatus.OK);
                }else{
                    return new ResponseEntity<>("2", HttpStatus.BAD_REQUEST);
                }
            }else{
                return new ResponseEntity<>("3", HttpStatus.CONFLICT);
            }

        }catch(InputMismatchException imm){
            imm.printStackTrace();
            return new ResponseEntity<>("0", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public Object SetScore(Informations info){
        try{
            Collection client = MapperClass.toCollection(repository.findById(info.getEmail()));
            if(client.getScore() >= info.getScore()){
                return new ResponseEntity<>("1", HttpStatus.ACCEPTED);
            } else{
                client.setScore(info.getScore());
                repository.save(client);
                return new ResponseEntity<>("4", HttpStatus.OK);
            }
        }catch(InputMismatchException imm){
            imm.printStackTrace();
            return new ResponseEntity<>("0", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity pegarFrases(String valor){
        Optional<CollectionPhrases> verificacao = repoPhrases.findById(valor);
        if(verificacao.isPresent()){
            CollectionPhrases docValor = verificacao.get();
            var jason = mapperJS.toJson(docValor);
            return new ResponseEntity<>(jason, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
