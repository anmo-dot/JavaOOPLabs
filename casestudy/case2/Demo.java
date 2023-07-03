package case2;

public class Demo {
	public static void main(String[] args) {
		Travel travel = new Travel();
		travel.setModeOfTravel('F');
		travel.setNoOfTickets(3);
		int serviceChargePerTicket = 0;
		if(travel.getModeOfTravel() == 'F') {
			serviceChargePerTicket = 500;
		}
		else if(travel.getModeOfTravel() == 'T') {
			serviceChargePerTicket = 100;
		}
		else if(travel.getModeOfTravel() == 'B') {
			serviceChargePerTicket = 50;
		}
		else {
			System.out.println("Not a valid mode of travel...!");
		}
		int TotalServiceCharge = serviceChargePerTicket * travel.getNoOfTickets();
		travel.setAmount(TotalServiceCharge);
		System.out.println(travel.getModeOfTravel());
		System.out.println(travel.getNoOfTickets());
		System.out.println(travel.getAmount());
	}
}
