package lab1;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
		Employee emp1 = new Employee("Ana", "Monter", 100, "C", "000:000");
		Employee emp2 = new Employee("James", "Parker", 200, "B", "000:000");
		assertEquals(2, emp2.getNumEmployees());
	}
	
	@Test
	public void testEmployeeId() {
		Employee emp3 = new Employee("Ana", "Monter", 100, "C", "000:000");
		assertEquals(503, emp3.getEmployeeId());
	}
}

