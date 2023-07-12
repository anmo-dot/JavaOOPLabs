package lab6;

public class ProjectManager extends PermanentEmployee{
	public ProjectManager(String firstName, String lastName, int yrsExp, String grade, Dates dates, String[] numCerts) {
		super(firstName, lastName, yrsExp, grade, dates);
		for(String c : numCerts) {
			if(c.equals("PMI")) {
				cert.add(c);
			}
			else {
				System.out.println(cert+" is an invalid input");
			}
		}
	}
	public double getMediclaim() {
		return getSalary();
	}
	@Override
	public int getSalary() {
		return salary*1000;
	}
	@Override
	public String toString() {
		return "ProjectManager [exp=" + exp + ", employeeId=" + employeeId + ", firstName=" + firstName + ", lastName="
				+ lastName + ", designation=PM" + "experience="+ exp + "certification="+ cert + "]";
	}
	
}
