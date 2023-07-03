package HW1;

public class Hostelite {
	private int studentId;
	private char studentType;
	private String hostelName;
	private double feesPerMonth;
	private String studentName;
	private int roomNumber;
	
	public Hostelite() {
		super();
	}

	public Hostelite(int studentId, char studentType, String firstName,
			String lastName, String hostelName, double feesPerMonth, 
			int roomNumber) {
		super();
		this.studentId = studentId;
		this.studentType = studentType;
		this.hostelName = hostelName;
		this.feesPerMonth = feesPerMonth;
		this.studentName = firstName+" "+lastName;
		this.roomNumber = roomNumber;
	}

	public String getHostelName() {
		return hostelName;
	}

	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
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
		this.studentName = firstName + lastName;
	}

	public double getFeesPerMonth() {
		return feesPerMonth;
	}

	public void setFeesPerMonth(double feesPerMonth) {
		this.feesPerMonth = feesPerMonth;
	}
	
}
