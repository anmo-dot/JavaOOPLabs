package hw6;

public class Ticket {
	protected static int totalTicket = 0;
	protected int ticketNumber;
	protected int issueDay;
	protected String origin;
	protected String destination;
	protected int remainingTrips;
	protected char type;
	
	public Ticket(){
		super();
		totalTicket += 1;
		this.ticketNumber = 100 + totalTicket;  
	}	
	
	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Ticket [ticketNumber=" + ticketNumber + ", issueDay=" + issueDay + ", origin=" + origin
				+ ", destination=" + destination + ", remainingTrips=" + remainingTrips + ", type=" + type + "]";
	}

	public static int getTotalTicket() {
		return totalTicket;
	}
	public static void setTotalTicket(int totalTicket) {
		Ticket.totalTicket = totalTicket;
	}
	public int getTicketNumber() {
		return ticketNumber;
	}
	public void setTicketNumber(int ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	public int getIssueDay() {
		return issueDay;
	}
	public void setIssueDay(int issueDay) {
		this.issueDay = issueDay;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getRemainingTrips() {
		return remainingTrips;
	}
	public void setRemainingTrips(int remainingTrips) {
		this.remainingTrips = remainingTrips;
	}

	public Ticket(int issueDay, String origin, String destination, int remainingTrips, char type) {
		this();
		this.issueDay = issueDay;
		this.origin = origin;
		this.destination = destination;
		this.remainingTrips = remainingTrips;
		this.type = type;
	}
	public Ticket(int issueDay, String origin, String destination, char type) {
		this();
		this.issueDay = issueDay;
		this.origin = origin;
		this.destination = destination;
		this.type = type;
	}
	
}
