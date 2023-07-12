package lab3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.Date;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeeTest {
	@Before
	public void setUp() {
		Employee emp = new Employee();
	}
	
	@Test
	public void testTotalEmployee() {
		Employee emp1 = new Employee("Ana", "Monter", 100, "C", new Dates(5,7,2023)); 
		Employee emp2 = new Employee("James", "Parker", 200, "B", new Dates(5,7,2023)); 
		assertEquals(2, emp2.getNumEmployees());
	}
	
	@Test
	public void testEmployeeId() {
		Employee emp3 = new Employee("Ana", "Monter", 100, "C", new Dates(5,7,2023));
		assertEquals(504, emp3.getEmployeeId());
	}
	@Test
	public void testDate() {
		Employee emp4 = new Employee("Ana", "Monter", 100, "C", new Dates(5,6,2023));
		assertEquals("5-6-2023", emp4.printDates());
	}
	@Test
	public void testPermanentSalary() {
		PermanentEmployee per = new PermanentEmployee("Ana", "Monter", 100, "C", new Dates(5,6,20234), 100);
		assertEquals(100, per.getPermanentSalary());
	}
	@Test
	public void testNotPermanentSalary() {
		PermanentEmployee per = new PermanentEmployee("Ana", "Monter", 100, "C", new Dates(5,6,20234), 90);
		assertNotEquals(100, per.getPermanentSalary());
	}
	@Test
	public void testPermanentNumber() {
		PermanentEmployee per = new PermanentEmployee("Ana", "Monter", 100, "C", new Dates(5,6,20234), 100);
		PermanentEmployee per2 = new PermanentEmployee("Ana", "Monter", 100, "C", new Dates(5,6,20234), 100);
		assertEquals(2, per2.getTotalPermanent());
	}
	@Test
	public void testContractSalary() {
		ContractEmployee per = new ContractEmployee("Ana", "Monter", "C", new Dates(5,6,20234), 20, 6);
		assertEquals(120, per.getContractSalary());
	}
	@Test
	public void testContractNumber() {
		ContractEmployee per = new ContractEmployee("Ana", "Monter", "C", new Dates(5,6,20234), 20, 6);
		ContractEmployee per2 = new ContractEmployee("Ana", "Monter", "C", new Dates(5,6,20234), 20, 6);
		assertEquals(2, per2.getTotalContract());
	}
	@Test
	public void testAllEmployees() {
		Employee emp5 = new Employee("Ana", "Monter", 100, "C", new Dates(5,6,2023));
		assertEquals(12, emp5.getEmployeeTotal());
	}
}

