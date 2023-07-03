package HW2;

public class Student {
	protected int studentId;
	protected char studentType;
	protected String studentName;
	protected double feesPerMonth;
	
	public Student() {
		super();
	}

	public Student(int studentId, char studentType, String firstName, String lastName) {
		super();
		this.studentId = studentId;
		this.studentType = studentType;
		this.studentName = firstName+" "+lastName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getStudentType() {
		return studentType;
	}

	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String firstName, String lastName) {
		this.studentName = firstName+" "+lastName;
	}

	public double getFeesPerMonth() {
		return feesPerMonth;
	}

	public void setFeesPerMonth(double feesPerMonth) {
		this.feesPerMonth = feesPerMonth;
	}
	
	
	/*
	 * public void calculateFees(double semesterFees) { this.feesPerMonth =
	 * semesterFees/6.0; }
	 * 
	 * public void calculateFees(double semesterFees, double hostelFees) {
	 * this.feesPerMonth = (semesterFees/6.0) + hostelFees; }
	 * 
	 * public String getFees() { return String.valueOf(feesPerMonth); }
	 */
	
}
