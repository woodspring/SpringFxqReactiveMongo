package woodspring.springfxqreactivemongo.repositry;


import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import woodspring.springfxqreactivemongo.model.FXQuote;

public interface ReactiveMongoFXQuoteRepository extends ReactiveMongoRepository<FXQuote, String>{

}
