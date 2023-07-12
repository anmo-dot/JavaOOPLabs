package lab3;

import java.util.Date;

public class Employee {
	// automatically generated sequential employee id
	// Accepts: first name, last name, salary, grade, and joining month (mmm:yyyy)
	// track how many employees created
	int employeeId;
	String firstName;
	String lastName;
	int salary;
	String grade;
	Dates date;
	protected int totalEmployees;
	static int numEmployees = 0;
	
	public Employee() {
		super();
		numEmployees += 1;
		this.employeeId += 500+employeeId+numEmployees;
		this.totalEmployees = numEmployees;
	}
	static int getNumEmployees() {
		return numEmployees;
	}
	
	static void setNumEmployees(int num) {
		numEmployees = num;
	}
	
	public Employee(String firstName, String lastName, int salary, String grade, Dates dates) {
		this();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.grade = grade;
		this.date = dates;
	}
	public Employee(String firstName, String lastName, String grade, Dates dates) {
		this();
		this.firstName = firstName;
		this.lastName = lastName;
		this.grade = grade;
		this.date = dates;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public int getEmployeeTotal() {
		return totalEmployees;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String printDates() {
		return date.getDay()+"-"+date.getMonth()+"-"+date.getYear();
	}
	public void setDates(Dates date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", salary=" + salary + ", grade=" + grade + ", date=" + date + ", totalEmployees=" + totalEmployees
				+ "]";
	}
	
}
