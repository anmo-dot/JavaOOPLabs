package hw6;

public class InvalidIssueDateException extends RuntimeException{
	private String message;
	
	public InvalidIssueDateException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}
}
