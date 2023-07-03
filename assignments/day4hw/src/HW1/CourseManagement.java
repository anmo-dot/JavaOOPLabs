package HW1;

public class CourseManagement {

	public static void main(String[] args) {
		Hostelite student = new Hostelite(20, 'F', "Lily", "Green", 
				"HostelName", 200.50, 138);
		System.out.print(" "+student.getStudentId());
		System.out.print(" "+student.getStudentType());
		System.out.print(" "+student.getStudentName());
		System.out.print(" "+student.getHostelName());
		System.out.print(" "+student.getFeesPerMonth());
		System.out.print(" "+student.getRoomNumber());
	}
}
