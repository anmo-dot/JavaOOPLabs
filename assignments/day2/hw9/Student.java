package hw9;

public class Student {
	int studentId;
	char studentType;
	String studentName;
	
	public Student() {
		super();
		this.studentId = 550;
	}
	public Student(char studentType, String firstName, String lastName) {
		this();
		this.studentType = studentType;
		this.studentName = firstName + " " +lastName;
	}
	
	public static void displayDetails(Student obj) {
		System.out.println(obj);
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentType=" + studentType + ", studentName=" + studentName
				+ "]";
	}
	public static void main(String[] args) {
		Student student = new Student();
		Student studentOne = new Student('D', "Bony", "Thomas");
		Student studentTwo = new Student('F', "Brown", "Sam");
		displayDetails(studentOne);
		displayDetails(studentTwo);
	}
	
}