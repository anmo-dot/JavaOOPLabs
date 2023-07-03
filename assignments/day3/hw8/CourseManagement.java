package hw8;

public class CourseManagement {

	public static void main(String[] args) {
		Student student = new Student(20, 'B', "James", "Black");
		student.setResidentialStatus("Hostelite");
		if("Hostelite".equals(student.getResidentialStatus())) {
			student.calculateFees(2000, 1500.60);
		} 
		else {
			student.calculateFees(2000);
		}
		System.out.print(" "+student.getStudentId());
		System.out.print(" "+student.getStudentName());
		System.out.print(" "+student.getResidentialStatus());
		System.out.print(" "+student.getFees());
	}
}
