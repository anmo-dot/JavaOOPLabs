package HW7;

public class Student{
	protected int studentId;
	protected char studentType;
	protected String studentName;
	protected final int semesterFees = 12000;
	protected int feesPerMonth;
	
	Student(){
		super();
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void calculateFees() {
		this.feesPerMonth = (int) (semesterFees/6.0);
	}
	public void displayDetails() {
		System.out.println("Student ID: "+this.studentId);
		System.out.println("Student Type: "+this.studentType);
		System.out.println("Student Fees Per Semester: "+this.semesterFees);
		System.out.println("Student Fees Per Month: "+this.feesPerMonth);
	}
}
