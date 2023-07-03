package hw6;

import java.util.HashMap;

public class MutliUseTicket {

	protected Ticket ticket;
	protected int date;
	private static HashMap<Integer, Ticket> used = new HashMap<Integer, Ticket>();
	
	public MutliUseTicket(Ticket t, int date) {
		this.ticket = t;
		this.date = date;
	}
	
	public void onward(int go) {
		int time = go - date;
		if(time > 60) {
			throw new InvalidIssueDateException("Invalid Ticket: Must be used within 2 months of issued date.");
		}else if(ticket.getRemainingTrips() == 0) {
			throw new UsedTicketException("Invalid Ticket: Ticket has already been used");
		}
		else {
			System.out.println("Successfully used ticket to go to "+ticket.getDestination());
			used.put(ticket.getTicketNumber(), ticket);
			int trips = ticket.getRemainingTrips();
			ticket.setRemainingTrips(trips-1);
		}
	}
	
	public void returning(int back) {
		int time = back - date;
		if(time > 60) {
			throw new InvalidIssueDateException("Invalid Ticket: Must be used within 2 months of issued date.");
		}else if(ticket.getRemainingTrips() == 0) {
			throw new UsedTicketException("Invalid Ticket: Ticket has already been used");
		}
		else {
			System.out.println("Successfully used ticket to come back to "+ticket.getOrigin());
			used.put(ticket.getTicketNumber(), ticket);
			int trips = ticket.getRemainingTrips();
			ticket.setRemainingTrips(trips-1);
		}
	}
}
