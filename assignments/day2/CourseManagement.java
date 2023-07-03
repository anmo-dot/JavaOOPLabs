package hw5;

public class CourseManagement {

	public static void main(String[] args) {
		Student student = new Student();
		System.out.println(student.getStudentId());
		System.out.println(student.getStudentType());
		Student per = new Student();
		per.setStudentId(105);
		per.setStudentType('B');
		System.out.println(per.getStudentId());
		System.out.println(per.getStudentType());
	}

}
