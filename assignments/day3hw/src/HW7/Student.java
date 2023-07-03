package HW7;

public class Student {
	private int studentId;
	private String studentName;
	private String residentialStatus;
	private long feesPerMonth;
	
	public Student() {
		super();
	}

	public Student(int studentId, String firstName, String lastName, String residentialStatus, long feesPerMonth) {
		super();
		this.studentId = studentId;
		this.studentName = firstName+" "+lastName;
		this.residentialStatus = residentialStatus;
		this.feesPerMonth = feesPerMonth;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getResidentialStatus() {
		return residentialStatus;
	}

	public void setResidentialStatus(String residentialStatus) {
		this.residentialStatus = residentialStatus;
	}

	public long getFeesPerMonth() {
		return feesPerMonth;
	}

	public void setFeesPerMonth(long feesPerMonth) {
		this.feesPerMonth = feesPerMonth;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String firstName, String lastName) {
		this.studentName = firstName+" "+lastName;
	}
	
}
