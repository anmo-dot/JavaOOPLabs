package HW5;

public class Student{
	protected static int studentId;
	protected char studentType;
	protected String studentName;
	public Student() {
		super();
		studentId++;
	}
	public Student(int studentId, char studentType, String studentName) {
		super();
		this.studentId = studentId;
		this.studentType = studentType;
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return "Student [studentType=" + studentType + ", studentName=" + studentName + "]";
	}	
}
