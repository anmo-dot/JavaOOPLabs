package lab2;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}

