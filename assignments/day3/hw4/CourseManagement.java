package hw4;

public class CourseManagement {

	public static void main(String[] args) {
		Student student = new Student();
		student.setStudentName("Lily", "Green");
		System.out.print(student.getStudentId());
		System.out.print(" "+student.getStudentType());
		System.out.print(" "+student.getStudentName());
		Student student2 = new Student(20, 'B', "Alex", "Brown");
		System.out.print("\n"+student2.getStudentId());
		System.out.print(" "+student2.getStudentType());
		System.out.print(" "+student2.getStudentName());
	}

}
