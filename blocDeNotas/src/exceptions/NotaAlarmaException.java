package exceptions;

public class NotaAlarmaException extends Exception {

	public NotaAlarmaException() {
	}

	public NotaAlarmaException(String message) {
		super(message);
	}

	public NotaAlarmaException(Throwable cause) {
		super(cause);
	}

	public NotaAlarmaException(String message, Throwable cause) {
		super(message, cause);
	}

	public NotaAlarmaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
