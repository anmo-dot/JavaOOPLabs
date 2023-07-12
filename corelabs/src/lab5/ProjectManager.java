package lab5;

public class ProjectManager extends PermanentEmployee{
	public ProjectManager(String firstName, String lastName, int yrsExp, String grade, Dates dates) {
		super(firstName, lastName, yrsExp, grade, dates);
		// TODO Auto-generated constructor stub
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
				+ lastName + ", designation=PM" + "]";
	}
	
}
