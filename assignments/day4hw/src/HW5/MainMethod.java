package HW5;

public class MainMethod {
	public static void main(String[] args) {
		DayScholar dayscholar = new DayScholar(5, "OOP", 16000, 1001, 'D', "Manu", "No 32/3 Vijayanagar");
		dayscholar.calculateFees();
		System.out.println("Post Course Id: "+dayscholar.getPostCourseId());
		System.out.println("Post Course Name: "+dayscholar.getPostCourseName());
		System.out.println("Fees: "+dayscholar.getFees());
		System.out.println("Id: "+Student.studentId);
		System.out.println("Type: "+dayscholar.studentType);
		System.out.println("Name: "+dayscholar.studentName);
		System.out.println("Address: "+dayscholar.residentialAddress);
	}
}
