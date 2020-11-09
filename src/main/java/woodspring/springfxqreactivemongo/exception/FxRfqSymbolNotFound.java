package woodspring.springfxqreactivemongo.exception;

public class FxRfqSymbolNotFound extends RuntimeException {
	FxRfqSymbolNotFound(String symbol) {
		super( "Could not find the symbol "+ symbol); 
	}

}
