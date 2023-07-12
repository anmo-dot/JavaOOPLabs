package com.seed.employee;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import com.seed.exception.EmployeeNotFoundException;
import com.seed.util.Dates;

public abstract class Employee implements Certification {
	// automatically generated sequential employee id
	// Accepts: first name, last name, salary, grade, and joining month (mmm:yyyy)
	// track how many employees created
	protected int employeeId;
	protected String firstName;
	protected String lastName;
	protected int salary;
	String grade;
	Dates date;
	protected int totalEmployees;
	protected ArrayList<String> cert;
	static int numEmployees = 0;
	protected static ArrayList<Employee> allEmp = new ArrayList<Employee>();
	
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
	
	public Employee(String firstName, String lastName, int salary, String grade, GregorianCalendar dates) {
		this();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.grade = grade;
		this.date = new Dates(dates.get(Calendar.YEAR), dates.get(Calendar.MONTH)+1, dates.get(Calendar.DATE));
		allEmp.add(this);
	}
	public Employee(String firstName, String lastName, String grade, GregorianCalendar dates) {
		this();
		this.firstName = firstName;
		this.lastName = lastName;
		this.grade = grade;
		this.date = new Dates(dates.get(Calendar.YEAR), dates.get(Calendar.MONTH)+1, dates.get(Calendar.DATE));
		allEmp.add(this);
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public int getTotalEmployees() {
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
	public static Employee findEmployee(int id) throws EmployeeNotFoundException {
		for(Employee e : allEmp) {
			if(e.getEmployeeId() == id) {
				return e;
			}
		}
		throw new EmployeeNotFoundException(id); 
	}
	@Override
	public ArrayList<String> listCert() {
		return cert;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", salary=" + salary + ", grade=" + grade + ", date=" + date + ", totalEmployees=" + totalEmployees
				+ "]";
	}
	
}
