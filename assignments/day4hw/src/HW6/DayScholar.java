package HW6;

public class DayScholar extends Student{
	protected String residentialAddress;
	
	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	
	@Override
	public void getDetails() {
		super.getDetails();
		System.out.println("Student Name: "+this.studentName);
		System.out.println("Residential Address: "+this.residentialAddress);
	}
	
}
