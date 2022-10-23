package shelest.lab1.exception;

import lombok.Getter;

@Getter
public enum ErrorType {
	INTERNAL_SERVER_ERROR(500),
	NOT_FOUND(404);
	private final int httpError;

	ErrorType(int httpError) {
		this.httpError = httpError;
	}

}
