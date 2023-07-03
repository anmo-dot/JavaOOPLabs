package hw6;

public class UsedTicketException extends RuntimeException{
	private String message;
	
	public UsedTicketException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}
}
