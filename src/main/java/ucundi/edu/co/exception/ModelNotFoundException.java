package ucundi.edu.co.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ModelNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;

	public ModelNotFoundException(String message) {
		super(message);
	}
}