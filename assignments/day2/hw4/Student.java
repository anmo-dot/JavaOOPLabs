package hw4;

public class Student {

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
