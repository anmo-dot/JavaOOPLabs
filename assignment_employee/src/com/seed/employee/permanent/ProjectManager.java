package com.seed.employee.permanent;

import java.util.GregorianCalendar;

import com.seed.util.Dates;

public class ProjectManager extends PermanentEmployee{
	protected int totalCerts;
	public ProjectManager(String firstName, String lastName, String grade, GregorianCalendar dates, int yrsExp, int numCerts) {
		super(firstName, lastName, yrsExp, grade, dates);
		this.totalCerts = numCerts;
	}
	@Override
	public double getMediclaim() {
		return getSalary();
	}
	@Override
	public int getSalary() {
		return exp*10000;
	}
	@Override
	public String toString() {
		return "ProjectManager [exp=" + exp + ", employeeId=" + employeeId + ", firstName=" + firstName + ", lastName="
				+ lastName + ", designation=PM" + "experience="+ exp + "certification="+ totalCerts + "]";
	}
	
}
