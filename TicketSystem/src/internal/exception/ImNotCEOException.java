package internal.exception;

public class ImNotCEOException extends Exception {
	
	public ImNotCEOException() {
		super("Only CEO can use this function");
	}
	
	@Override
	public String toString() {
		return getMessage();
	}
}
