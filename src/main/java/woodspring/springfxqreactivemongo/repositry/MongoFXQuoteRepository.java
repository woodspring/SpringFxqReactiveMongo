package woodspring.springfxqreactivemongo.repositry;

import org.springframework.data.mongodb.repository.MongoRepository;

import woodspring.springfxqreactivemongo.model.FXQuote;



public interface MongoFXQuoteRepository extends MongoRepository<FXQuote, String> {

}
