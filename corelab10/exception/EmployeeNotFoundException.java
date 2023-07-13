package com.seed.exception;

public class EmployeeNotFoundException extends Exception {
	public EmployeeNotFoundException(int id) {
		super("Employee with ID: "+id+" does not exists");
	}
}
