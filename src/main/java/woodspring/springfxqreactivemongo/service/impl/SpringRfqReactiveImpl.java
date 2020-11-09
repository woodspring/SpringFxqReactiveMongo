package woodspring.springfxqreactivemongo.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import woodspring.springfxqreactivemongo.repositry.ReactiveMongoFXQuoteRepository;
import woodspring.springfxqreactivemongo.repositry.ReactiveMongoFXSpotRepository;
import woodspring.springfxqreactivemongo.service.SpringRfqService;

@Service("ReactiveRfq")
public class SpringRfqReactiveImpl  implements SpringRfqService {
	private static final Logger logger = LoggerFactory.getLogger( SpringRfqReactiveImpl.class);
	
	@Autowired
	ReactiveMongoFXQuoteRepository fxQuoteRepo;
	
	@Autowired
	ReactiveMongoFXSpotRepository fxSpotRepo;

}
