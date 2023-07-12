package lab5;

import java.util.Date;

public abstract class PermanentEmployee extends Employee{
	// automatically generated sequential employee id
	// Accepts: first name, last name, salary, grade, and joining month (mmm:yyyy)
	// track how many employees created
	static int numPermanent = 0;
	int totalPermanent;
	int permanentSalary;
	int exp;
	
	public PermanentEmployee(String firstName, String lastName, int yrsExp, String grade, Dates dates) {
		super(firstName, lastName, grade, dates);
		numPermanent += 1;
		this.totalPermanent = numPermanent;
		this.exp = yrsExp;
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
}
