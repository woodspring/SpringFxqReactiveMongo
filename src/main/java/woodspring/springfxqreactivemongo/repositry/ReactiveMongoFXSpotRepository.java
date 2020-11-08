package woodspring.springfxqreactivemongo.repositry;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import woodspring.springfxqreactivemongo.model.FXSpot;



public interface ReactiveMongoFXSpotRepository extends ReactiveMongoRepository<FXSpot, String> {

}
