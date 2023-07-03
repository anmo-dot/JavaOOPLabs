package HW2;

public class Hostelite extends Student{
	private String hostelName;
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
}
