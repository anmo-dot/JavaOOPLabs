package HW4;

public class DayScholar extends Student{
	private String residentialAddress;
	// error 1: implicit constructor needed, move super
	public DayScholar(int studentId, char studentType, String studName, 
			int semFees, String residentialAddress) {
		super(studentId, studentType, studName, semFees);
		this.residentialAddress = residentialAddress;
		
	}

	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println(this.residentialAddress);
	}
}
