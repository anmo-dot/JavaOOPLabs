package HW4ext;

public class DayScholar extends Student{
	private String residentialAddress;
	// error 1: implicit constructor needed, move super
	DayScholar(int studentId, char studentType, String studName, 
			int semFees, String residentialAddress, String cName) {
		super(studentId, studentType, studName, semFees, cName);
		this.residentialAddress = residentialAddress;
	}

	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Residential Address: "+this.residentialAddress);
	}
}
