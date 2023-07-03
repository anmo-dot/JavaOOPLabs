package HW3;

public class Hostelite extends Student{
	private String hostelName;
	private int roomNumber;
	
	@Override
	public void displayStudentDetails() {
		System.out.println(this.feesPerMonth);
		System.out.println(this.hostelName);
		System.out.println(this.roomNumber);
		
	}
	
	public Hostelite() {
		super();
	}

	public Hostelite(int studentId, char studentType, String firstName,
			String lastName, String hostelName, double feesPerMonth, 
			int roomNumber) {
		super(studentId, studentType, firstName, lastName);
		this.hostelName = hostelName;
		this.feesPerMonth = feesPerMonth;
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
