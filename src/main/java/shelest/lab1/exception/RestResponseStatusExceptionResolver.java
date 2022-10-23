package shelest.lab1.exception;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class RestResponseStatusExceptionResolver extends ResponseEntityExceptionHandler {

	@ExceptionHandler(CustomException.class)
	protected ResponseEntity<Object> handleCBException(CustomException exception) {
		exception.printStackTrace();
		return ResponseEntity.status(exception.getErrorType().getHttpError())
				.contentType(MediaType.APPLICATION_JSON)
				.body(new MessageDto(exception.getMessage()));
	}

	@ExceptionHandler(Exception.class)
	protected ResponseEntity<Object> handleRuntimeException(Exception exception) {
		exception.printStackTrace();
		return ResponseEntity.status(500)
				.contentType(MediaType.APPLICATION_JSON)
				.body(new MessageDto("Internal error"));
	}
}
