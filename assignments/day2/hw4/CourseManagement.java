package hw4;

public class CourseManagement {

	public static void main(String[] args) {
		Student per = new Student();
		per.setStudentId(105);
		per.setStudentType('B');
		System.out.println(per.getStudentId());
		System.out.println(per.getStudentType());
		System.out.println(per);
	}

}
