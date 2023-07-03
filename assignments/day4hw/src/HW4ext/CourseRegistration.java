package HW4ext;

public class CourseRegistration {
	protected static int regId;
	protected String courseName;
	public CourseRegistration() {
		regId++;
	}
	CourseRegistration(String cName){
		this();
		this.courseName = cName;
	}
	
	public void displayDetails() {
		System.out.println("Registration ID: "+regId);
		System.out.println("CourseName: "+courseName);
	}
}
