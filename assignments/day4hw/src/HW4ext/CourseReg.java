package HW4ext;

public class CourseReg {
	public static void main(String[] args) {
		DayScholar dayscholar = new DayScholar(1001, 'D', "Eugene",
				12000, "No 32/68 Vijayanagar", "Math");
		Student student = new Student(1001, "Math");
		CourseRegistration core = new CourseRegistration();
		dayscholar.displayDetails();
		
	}
}
