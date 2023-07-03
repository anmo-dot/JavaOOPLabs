package HW4ext;

public class Student extends CourseRegistration{
	protected int studentId;
	protected char studentType;
	protected String studentName;
	protected int semesterFees;
	protected double feesPerMonth;
	Student(int studentId, String cName){
		super(cName);
		this.studentId = studentId;
	}
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Student ID: "+this.studentId);
		System.out.println("Student Type: "+this.studentType);
		System.out.println("Student Name: "+this.studentName);
		System.out.println("Semester Fees: "+this.semesterFees);
	}

	public Student(int studentId, char studentType, String studName, 
			int semFees, String cName) {
		super(cName);
		this.studentId = studentId;
		this.studentType = studentType;
		this.studentName = studName;
		this.semesterFees = semFees;
	}
}
