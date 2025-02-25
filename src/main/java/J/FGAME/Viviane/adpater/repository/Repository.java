package J.FGAME.Viviane.adpater.repository;

import J.FGAME.Viviane.application.domain.Collection;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Repository extends MongoRepository<Collection, String> {
}

