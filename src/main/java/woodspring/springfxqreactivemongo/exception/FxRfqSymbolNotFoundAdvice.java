package woodspring.springfxqreactivemongo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class FxRfqSymbolNotFoundAdvice {
	
	@ResponseBody
	@ExceptionHandler(FxRfqSymbolNotFound.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String FxRfqSymbolNotFoundHandler( FxRfqSymbolNotFound ex) {
		return ex.getMessage();
	}

}
