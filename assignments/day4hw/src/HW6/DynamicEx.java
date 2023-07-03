package HW6;

public class DynamicEx {
	public static void main(String[] args) {
		Student dayScholar = new DayScholar();
		dayScholar.setStudentId(1001);
		dayScholar.setStudentType('D');
		dayScholar.setStudentName("Thomas");
		((DayScholar) dayScholar).setResidentialAddress("Address");
		dayScholar.getDetails();
	}
}
