package HW8;

public class CourseManagement {

	public static void main(String[] args) {
		// 20 F Ana Monter Blue 200.50 138 Hostelite
		for (String a : args) {
			if("Hostelite".equals(a)) {
				Hostelite student = new Hostelite(Integer.parseInt(args[0]), args[1].charAt(0), args[2], args[3], args[4], Double.parseDouble(args[5]), Integer.parseInt(args[6]));
				student.displayStudentDetails();
			}
			if("Dayscholar".equals(a)) {
				//10 S Lily James Address 200.50 Dayscholar
				DayScholar student = new DayScholar(Integer.parseInt(args[0]), args[1].charAt(0), args[2], args[3], args[4], 120.65);
				student.displayStudentDetails();
			}
		}
	}
}
