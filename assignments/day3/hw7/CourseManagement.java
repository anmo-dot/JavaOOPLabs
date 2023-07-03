package hw7;

public class CourseManagement {

	public static void main(String[] args) {
		int studentId = Integer.parseInt(args[0]);
		String firstName = args[1];
		String lastName = args[2];
		String residentialStatus = args[3];
		long feesPerMonth = Long.parseLong(args[4]);
		Student student = new Student(studentId, firstName, lastName, residentialStatus, feesPerMonth);
		System.out.print(" "+student.getStudentId());
		System.out.print(" "+student.getStudentName());
		System.out.print(" "+student.getResidentialStatus());
		System.out.print(" "+student.getFeesPerMonth());
	}
}
