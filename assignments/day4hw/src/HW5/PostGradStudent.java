package HW5;

public class PostGradStudent extends Student{
	protected int postCourseId;
	protected String postCourseName;
	protected int postCoursefees;
	public PostGradStudent(int postCourseId, String postCourseName, 
			int postCoursefees, int studentId, char studentType, 
			String studentName) {
		super(studentId, studentType, studentName);
		this.postCourseId = postCourseId;
		this.postCourseName = postCourseName;
		this.postCoursefees = postCoursefees;
	}
	@Override
	public String toString() {
		return "PostGradStudent [postCourseId=" + postCourseId + ", postCourseName=" + postCourseName
				+ ", postCoursefees=" + postCoursefees + "]";
	}
	public int getPostCourseId() {
		return postCourseId;
	}
	public String getPostCourseName() {
		return postCourseName;
	}
}
