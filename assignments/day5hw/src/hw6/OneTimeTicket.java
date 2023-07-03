package hw6;

import java.util.HashMap;

public class OneTimeTicket {
	// one day travel, used same day issued
	// from one origin to destinations
	
	protected Ticket ticket;
	protected int date;
	private static HashMap<Integer, Ticket> used = new HashMap<Integer, Ticket>();

	public OneTimeTicket(Ticket t, int date) {
		this.ticket = t;
		this.date = date;
		
	}
	public void checkTicket() {
		if(date != ticket.getIssueDay()) {
			throw new InvalidIssueDateException("Invalid Ticket: Must be used date it was issued.");
		} else if(used.containsKey(ticket.getTicketNumber())) {
			throw new UsedTicketException("Invalid Ticket: Ticket has already been used");
		} else {
			used.put(ticket.getTicketNumber(), ticket);
		}
	}
	
}	
