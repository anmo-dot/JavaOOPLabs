package HW5;

public class DayScholar extends PostGradStudent{
	protected String residentialAddress;
	// error 1: implicit constructor needed, move super
	DayScholar(int postCourseId, String postCourseName, 
			int postCoursefees, int studentId, char studentType, 
			String studentName, String residentialAddress) {
		super(postCourseId, postCourseName, postCoursefees, studentId, studentType, studentName);
		this.residentialAddress = residentialAddress;
	}

	public void calculateFees() {
		int fees = postCoursefees/6;
		this.postCoursefees = fees;
	}
	
	public int getFees() {
		return postCoursefees;
	}

	@Override
	public String toString() {
		return "DayScholar [residentialAddress=" + residentialAddress + "]";
	}
}
