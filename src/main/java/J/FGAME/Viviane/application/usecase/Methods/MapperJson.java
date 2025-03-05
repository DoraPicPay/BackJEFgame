package J.FGAME.Viviane.application.usecase.Methods;

import J.FGAME.Viviane.application.domain.*;

public class MapperJson {
    public static PhrasesJson colPhrasestoJson(CollectionPhrases phrases){
        return new PhrasesJson(phrases.get_id(), phrases.getCerta(), phrases.getErradaUm(), phrases.getErradaDois(), phrases.getErradaTres());
    }

    public static DescricaoJson colDescriocaoJson(CollectionDescricao colDesc){
        return new DescricaoJson(colDesc.getValor(), colDesc.getDescricao(), colDesc.getImagem());
    }
}
