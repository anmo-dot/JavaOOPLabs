package hw6;

public class UserType {
	String name;

	public UserType(String parameterVal) {
		super();
		this.name = parameterVal;
	}


	public UserType() {
		this("student");
	}


	public static void main(String[] args) {
		UserType usertype1 = new UserType("Faculty");
		UserType usertype2 = new UserType();
		System.out.println(usertype1.name);
		System.out.println(usertype2.name);

	}
}
