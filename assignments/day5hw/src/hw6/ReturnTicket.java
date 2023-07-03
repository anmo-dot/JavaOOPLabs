package hw6;

import java.util.HashMap;

public class ReturnTicket {

	protected Ticket ticket;
	protected String date;
	private static HashMap<Integer, Ticket> going = new HashMap<Integer, Ticket>();
	private static HashMap<Integer, Ticket> backing = new HashMap<Integer, Ticket>();
	
	public ReturnTicket(Ticket t) {
		this.ticket = t;
		this.date = date;
	}

	public boolean checkTicket() {
		
		return false;
	}
	
	public void onward(String currentDate, String go) {
		if(!date.equalsIgnoreCase(ticket.getIssueDay())) {
			throw new InvalidIssueDateException("Invalid Ticket: Must be used date it was issued.");
		}else if(going.containsKey(ticket.getTicketNumber())) {
			throw new UsedTicketException("Invalid Ticket: Ticket has already been used");
		}
		else {
			System.out.println("Successfully used ticket to go to "+ticket.getDestination());
			going.put(ticket.getTicketNumber(), ticket);
		}
	}
	
	public void returning(String currentDate, String back) {
		if(!date.equalsIgnoreCase(ticket.getIssueDay())) {
			throw new InvalidIssueDateException("Invalid Ticket: Must be used within 1 week of issued date.");
		}else if(backing.containsKey(ticket.getTicketNumber())) {
			throw new UsedTicketException("Invalid Ticket: Ticket has already been used");
		}
		else {
			System.out.println("Successfully used ticket to come back to "+ticket.getOrigin());
			backing.put(ticket.getTicketNumber(), ticket);
		}
	}

}
