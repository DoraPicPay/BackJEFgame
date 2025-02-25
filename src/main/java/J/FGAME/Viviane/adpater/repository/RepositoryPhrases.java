package J.FGAME.Viviane.adpater.repository;

import J.FGAME.Viviane.application.domain.CollectionPhrases;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositoryPhrases extends MongoRepository<CollectionPhrases, String> {
}
