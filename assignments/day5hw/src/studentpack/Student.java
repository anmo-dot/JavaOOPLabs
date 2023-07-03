package studentpack;

public class Student {
	// debug: private and regular int do not allow to print in class of other package
	// only protected does
	protected int studentId;
	protected char studentType;
	protected String studentName;
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
}
