package lab5;

import java.util.Date;

public abstract class ContractEmployee extends Employee{
	// automatically generated sequential employee id
	// Accepts: first name, last name, salary, grade, and joining month (mmm:yyyy)
	// track how many employees created
	static int numContract = 0;
	int totalContract;
	int contractSalary;
	int hours;
	int rate;
	
	public ContractEmployee(String firstName, String lastName, String grade, Dates dates, int hours, int rate) {
		super(firstName, lastName, grade, dates);
		this.hours = hours;
		this.rate = rate;
		numContract += 1;
		this.totalContract = numContract;
	}
	public static int getNumContract() {
		return numContract;
	}
	public static void setNumContract(int numContract) {
		ContractEmployee.numContract = numContract;
	}
	public int getTotalContract() {
		return totalContract;
	}
	public void setTotalContract(int totalContract) {
		this.totalContract = totalContract;
	}
	public int getContractSalary() {
		this.contractSalary = rate*hours;
		return contractSalary;
	}
	public void setContractSalary(int rate, int hours) {
		this.contractSalary = rate*hours;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	
	
	
}
