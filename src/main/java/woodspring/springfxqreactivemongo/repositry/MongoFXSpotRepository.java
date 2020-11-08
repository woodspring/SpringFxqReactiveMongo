package woodspring.springfxqreactivemongo.repositry;

import org.springframework.data.mongodb.repository.MongoRepository;

import woodspring.springfxqreactivemongo.model.FXSpot;


public interface MongoFXSpotRepository  extends MongoRepository<FXSpot, String> {

}
