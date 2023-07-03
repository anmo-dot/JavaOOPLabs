package HW7;

public class DynamicEx {
	public static void main(String[] args) {
		DayScholar dayScholar = new DayScholar();
		dayScholar.setStudentId(1001);
		dayScholar.setStudentType('D');
		dayScholar.setStudentName("Thomas");
		//dayScholar.setResidentialAddress("Address");
		dayScholar.calculateFees();
		dayScholar.displayDaySDetails();
	}
}
