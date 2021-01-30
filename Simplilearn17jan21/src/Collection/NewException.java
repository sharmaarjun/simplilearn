package Collection;

public class NewException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;
	
	NewException(String message){
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	
	public String toString() {
		return "I want to print this:: "+message;
	}

}
