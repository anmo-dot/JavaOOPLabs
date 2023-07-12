package lab6;

import java.util.ArrayList;

public class PermanentTechnicalAssociate extends PermanentEmployee{
	public PermanentTechnicalAssociate(String firstName, String lastName, int yrsExp, String grade, Dates dates, String[] numCerts) {
		super(firstName, lastName, yrsExp, grade, dates);
		for(String c : numCerts) {
			if(c.equals("SCJP") || c.equals("SCWCD") || c.equals("SCBCD")) {
				cert.add(c);
			}
			else {
				System.out.println(cert+" is an invalid input");
			}
		}
	}
	public double getMediclaim() {
		return getSalary()*2;
	}	
	@Override
	public int getSalary() {
		return (getSalary()*5000)+(cert.size()*1000);
	}
	@Override
	public String toString() {
		String out =  "PermanentTechnicalAssociate [exp=" + exp + ", employeeId=" + employeeId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", designation=TA-P" + "experience="+ exp + "certification=";
		for(int i = 0; i < cert.size(); i++) {
			if(i == cert.size()-1) {
				out += cert.get(i);
			}
			else {
				out += cert.get(i)+"/";
			}
		}
		return out;
	}
}
