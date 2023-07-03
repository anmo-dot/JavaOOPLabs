package HW4;

public class Student {
	protected int studentId;
	protected char studentType;
	protected String studentName;
	protected int semesterFees;
	protected double feesPerMonth;
	Student(){
		super();
	}
	public void displayDetails() {
		System.out.println(this.studentId);
		System.out.println(this.studentType);
		System.out.println(this.studentName);
		System.out.println(this.semesterFees);
	}

	public Student(int studentId, char studentType, String studName, 
			int semFees) {
		super();
		this.studentId = studentId;
		this.studentType = studentType;
		this.studentName = studName;
		semesterFees = semFees;
	}
}
