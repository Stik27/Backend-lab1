package shelest.lab1.exception;

import lombok.Getter;

@Getter
public class CustomException extends RuntimeException {
	private final ErrorType errorType;

	public CustomException(ErrorType errorType, String message) {
		super(message);
		this.errorType = errorType;
	}

}
