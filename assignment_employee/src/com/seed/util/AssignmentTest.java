package com.seed.util;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.GregorianCalendar;

import org.junit.jupiter.api.Test;

import com.seed.employee.Employee;
import com.seed.employee.contract.ContractEmployee;
import com.seed.employee.contract.ContractTechnicalAssociate;
import com.seed.employee.permanent.PermanentEmployee;
import com.seed.employee.permanent.PermanentTechnicalAssociate;
import com.seed.employee.permanent.ProjectManager;

public class AssignmentTest {

	@Test
	void test() throws ParseException {
        ContractEmployee contractEmp = new ContractTechnicalAssociate("Lily", "Park", "1", 
        		new GregorianCalendar(2018,12,31), 30, 28, 2);
        PermanentEmployee permAsso = new PermanentTechnicalAssociate("Andy", "Brown", "2", 
        		new GregorianCalendar(2018,12,31), 20, 2);
        PermanentEmployee pm = new ProjectManager("Wendy", "Simmons", "1", 
        		new GregorianCalendar(2018,12,31), 10, 1);
        
        assertEquals(3, Employee.getNumEmployees());
        
        assertEquals(20*5000+2*1000, permAsso.getSalary());
        assertEquals(10*10000, pm.getSalary());
        
        assertEquals(204000, permAsso.getMediclaim());
        assertEquals(100000, pm.getMediclaim());
        
        contractEmp.setHours(20);
        assertEquals(560, contractEmp.getSalary());
        contractEmp.setHours(60);
        assertEquals(2240, contractEmp.getSalary());

  	}

}
