package lab4;

public class PermanentTechnicalAssociate extends PermanentEmployee{
	int NumCerts;
	public PermanentTechnicalAssociate(String firstName, String lastName, int yrsExp, String grade, Dates dates, int numCerts) {
		super(firstName, lastName, yrsExp, grade, dates);
		this.NumCerts = numCerts;
	}
	public double getMediclaim() {
		return getSalary()*2;
	}	
	@Override
	public int getSalary() {
		return (getSalary()*5000)+(NumCerts*1000);
	}
	@Override
	public String toString() {
		return "PermanentTechnicalAssociate [exp=" + exp + ", employeeId=" + employeeId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", designation=TA-P" + "]";
	}
}
