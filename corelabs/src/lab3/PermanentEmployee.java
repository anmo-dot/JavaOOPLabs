package lab3;

import java.util.Date;

public class PermanentEmployee extends Employee{
	// automatically generated sequential employee id
	// Accepts: first name, last name, salary, grade, and joining month (mmm:yyyy)
	// track how many employees created
	static int numPermanent = 0;
	int totalPermanent;
	int permanentSalary;
	
	public PermanentEmployee(String firstName, String lastName, int salary, String grade, Dates dates, int joinSalary) {
		super(firstName, lastName, grade, dates);
		numPermanent += 1;
		this.totalPermanent = numPermanent;
		if(salary==joinSalary) {
			this.permanentSalary = salary;
		}
	}
	public static int getNumPermanent() {
		return numPermanent;
	}
	public static void setNumPermanent(int numPermanent) {
		PermanentEmployee.numPermanent = numPermanent;
	}
	public int getTotalPermanent() {
		return totalPermanent;
	}
	public void setTotalPermanent(int totalPermanent) {
		this.totalPermanent = totalPermanent;
	}
	public int getPermanentSalary() {
		return permanentSalary;
	}	
}
