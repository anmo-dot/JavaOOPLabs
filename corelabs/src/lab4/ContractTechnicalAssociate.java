package lab4;

public class ContractTechnicalAssociate extends ContractEmployee{

	public ContractTechnicalAssociate(String firstName, String lastName, String grade, Dates dates, int hours,
			int rate) {
		super(firstName, lastName, grade, dates, hours, rate);
		// TODO Auto-generated constructor stub
	}
	public double getMediclaim() {
		return 0;
	}
	public int getSalary() {
		if(hours <= 40) {
			return rate*hours;
		}
		else{
			return 40*rate+(hours-40)*rate*2;
		}
	}
	@Override
	public String toString() {
		return "ContractTechnicalAssociate [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName="
				+ lastName + ", designation=TA-C" + "]";
	}
}
