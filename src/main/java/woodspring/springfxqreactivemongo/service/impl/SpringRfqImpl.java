package woodspring.springfxqreactivemongo.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import woodspring.springfxqreactivemongo.repositry.MongoFXQuoteRepository;
import woodspring.springfxqreactivemongo.repositry.MongoFXSpotRepository;
import woodspring.springfxqreactivemongo.service.SpringRfqService;


@Service
public class SpringRfqImpl implements SpringRfqService {
	private static final Logger logger = LoggerFactory.getLogger( SpringRfqImpl.class);
	
	@Autowired
	MongoFXQuoteRepository fxQuoteRepo;
	
	@Autowired 
	MongoFXSpotRepository fxSpotRepo;
	

}
