package J.FGAME.Viviane.adpater.repository;

import J.FGAME.Viviane.application.domain.CollectionDescricao;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositoryDescricao extends MongoRepository<CollectionDescricao, String> {
}
