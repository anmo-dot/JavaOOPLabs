package hw5;

public class Student {

	public Student() {
		super();
		setStudentId(10);
		setStudentType('F');
	}
	private int studentId;
	private char studentType;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public char getStudentType() {
		return studentType;
	}
	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentType=" + studentType + "]";
	}
}
