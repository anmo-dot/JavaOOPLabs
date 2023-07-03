package HW7;

public final class DayScholar extends Student{
	protected String residentialAddress;
	DayScholar() {
		super();
	}
	DayScholar(int studentId, char studentType, String StudentName, double Semesterfees, String residentialAddress){
		super();
	}
	
	public void displayDaySDetails() {
		super.displayDetails();
		System.out.println("Student Name: "+this.studentName);
		//System.out.println("Residential Address: "+this.residentialAddress);
	}	
}
