package HW3;

public class DayScholar extends Student{
	private String residentialAddress;

	public DayScholar() {
		super();
	}

	public DayScholar(int studentId, char studentType, String firstName,
			String lastName, String residentialAddress, double feesPerMonth) {
		super(studentId, studentType, firstName, lastName);
		this.feesPerMonth = feesPerMonth;
		this.residentialAddress = residentialAddress;
	}

	public String getResidentialAddress() {
		return residentialAddress;
	}

	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	
	@Override
	public void displayStudentDetails() {
		System.out.println(this.feesPerMonth);
		System.out.println(this.residentialAddress);
	}
}
