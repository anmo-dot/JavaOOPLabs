package com.seed.employee.contract;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import com.seed.util.Dates;

public class ContractTechnicalAssociate extends ContractEmployee{
	protected int totalCerts;
	public ContractTechnicalAssociate(String firstName, String lastName, String grade, GregorianCalendar dates, int hours,
			int rate, int numCerts) {
		super(firstName, lastName, grade, dates, hours, rate);
		this.totalCerts = numCerts;
	}
	public double getMediclaim() {
		return 0;
	}
	
	@Override
	public int getSalary() {
		if(this.hours <= 40) {
			return this.rate*this.hours;
		}
		else{
			return 40*this.rate+(this.hours-40)*this.rate*2;
		}
	}
	@Override
	public String toString() {
		return "ContractTechnicalAssociate [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName="
				+ lastName + ", designation=TA-C" + "certification=" + totalCerts;
	}
}
