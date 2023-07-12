package com.seed.employee.permanent;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import com.seed.util.Dates;

public class PermanentTechnicalAssociate extends PermanentEmployee{
	protected int totalCerts;
	public PermanentTechnicalAssociate(String firstName, String lastName, String grade, GregorianCalendar dates,int yrsExp, int numCerts) {
		super(firstName, lastName, yrsExp, grade, dates);
		
		this.totalCerts = numCerts;
	}
	@Override
	public double getMediclaim() {
		return getSalary()*2;
	}	
	@Override
	public int getSalary() {
		return (exp*5000)+(totalCerts*1000);
	}
	@Override
	public String toString() {
		return "PermanentTechnicalAssociate [exp=" + exp + ", employeeId=" + employeeId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", designation=TA-P" + "experience="+ exp + "certification=" + totalCerts;
	}
}
