package com.seed.employee.contract;

import java.util.ArrayList;

import com.seed.util.Dates;

public class ContractTechnicalAssociate extends ContractEmployee{

	public ContractTechnicalAssociate(String firstName, String lastName, String grade, Dates dates, int hours,
			int rate, String[] numCerts) {
		super(firstName, lastName, grade, dates, hours, rate);
		for(String c : numCerts) {
			if(c.equals("SCJP") || c.equals("SCWCD") || c.equals("SCBCD")) {
				cert.add(c);
			}
			else {
				System.out.println(cert+" is an invalid input");
			}
		}
	}
	public double getMediclaim() {
		return 0;
	}
	
	@Override
	public int getSalary() {
		if(hours <= 40) {
			return rate*hours;
		}
		else{
			return 40*rate+(hours-40)*rate*2;
		}
	}
	@Override
	public String toString() {
		String out = "ContractTechnicalAssociate [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName="
				+ lastName + ", designation=TA-C" + "certification=";
		for(int i = 0; i < cert.size(); i++) {
			if(i == cert.size()-1) {
				out += cert.get(i);
			}
			else {
				out += cert.get(i)+"/";
			}
		}
		return out;
	}
}
