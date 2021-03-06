package exceptionhandling;

public class AccountNotFoundException extends Exception {
	/**
	 * need to add the serial version ID
	 */
	private static final long serialVersionUID = 1L;
	String message;
	
	AccountNotFoundException(String message){
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	
	public String toString() {
		return " :: Account related error :: "+ message;
	}

}
