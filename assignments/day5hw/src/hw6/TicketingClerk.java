package hw6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TicketingClerk {
	
	private static HashMap<Integer, Ticket> lst = new HashMap<Integer, Ticket>();
	protected static int currentDate = 3;
	
	public static void main(String[] args) {
		boolean loop = true;
		do {
			Scanner s = new Scanner(System.in);
			System.out.println("=================================");
			System.out.println("Main Menu");
			System.out.println("1. Purchase Ticket");
			System.out.println("2. Submit Ticket");
			System.out.println("3. Exit");
			System.out.print("> ");
			int action = s.nextInt();
			switch(action) {
			case 1:
				System.out.print("\n=================================");
				System.out.println("\nAvailable Tickets: ");
				System.out.println("1. Purchase One Way Ticket");
				System.out.println("2. Purchase Return Ticket");
				System.out.println("3. Purchase Multi-Use Ticket");
				System.out.println("4. Exit");
				System.out.print("> ");
				int type = s.nextInt();
				int date;
				String origin;
				String dest;
				int ticketNum;
				switch(type) {
				case 1:
					System.out.print("Enter Date: ");
					date = s.nextInt();
					System.out.print("Enter Origin: ");
					origin = s.next();
					System.out.print("Enter Destination: ");
					dest = s.next();
					Ticket onetimeticket = new Ticket(date, origin, dest, 'O');
					ticketNum = onetimeticket.getTicketNumber();
					lst.put(ticketNum, onetimeticket);
					System.out.println("Ticket Number: "+ticketNum);
					break;
				case 2:
					System.out.print("Enter Date: ");
					date = s.nextInt();
					System.out.print("Enter Origin: ");
					origin = s.next();
					System.out.print("Enter Destination: ");
					dest = s.next();
					Ticket returnticket = new Ticket(date, origin, dest, 'R');
					ticketNum = returnticket.getTicketNumber();
					lst.put(ticketNum, returnticket);
					System.out.println("Ticket Number: "+ticketNum);
					break;
				case 3:
					System.out.print("Enter Date: ");
					date = s.nextInt();
					System.out.print("Enter Origin: ");
					origin = s.next();
					System.out.print("Enter Destination: ");
					dest = s.next();
					System.out.print("Trip Denomination (10, 15, 20): ");
					int denomination = s.nextInt();
					Ticket multiticket = new Ticket(date, origin, dest, denomination, 'M');
					ticketNum = multiticket.getTicketNumber();
					lst.put(ticketNum, multiticket);
					System.out.println("Ticket Number: "+ticketNum);
					break;
				case 4:
					loop = false;
					break;
				default:
					System.out.println("Invalid choice");
					break;
				}
				break;
			case 2:
				System.out.print("Enter Ticket Number > ");
				int ticket = s.nextInt();
				if(lst.containsKey(ticket)) {
					System.out.println(ticket+" ticket found");
					Ticket t = lst.get(ticket);
					switch(t.getType()) {
					case 'O':
						OneTimeTicket onetime = new OneTimeTicket(t, currentDate);
						onetime.checkTicket();
						break;
					case 'R':
						ReturnTicket ret = new ReturnTicket(t, currentDate);
						System.out.print("\n=================================");
						System.out.println("\nTicket Options: ");
						System.out.println("1. Onward to Destination");
						System.out.println("2. Returning to Origin");
						System.out.print("> ");
						int route = s.nextInt();
						switch(route) {
						case 1:
							System.out.println("Onward Date: ");
							int go = s.nextInt();
							ret.onward(go);
							break;
						case 2:
							System.out.println("Return Date: ");
							int back = s.nextInt();
							ret.returning(back);
							break;
						default:
							System.out.println("Invalid Choice");
							break;
						}
						break;
					case 'M':
						MutliUseTicket multi = new MutliUseTicket(t, currentDate);
						System.out.print("\n=================================");
						System.out.println("\nTicket Options: ");
						System.out.println("1. Onward to Destination");
						System.out.println("2. Returning to Origin");
						System.out.print("> ");
						int routeMult = s.nextInt();
						switch(routeMult) {
						case 1:
							System.out.println("Onward Date: ");
							int go = s.nextInt();
							multi.onward( go);
							break;
						case 2:
							System.out.println("Return Date: ");
							int back = s.nextInt();
							multi.returning(back);
							break;
						default:
							System.out.println("Invalid Choice");
							break;
						}
						break;
					default:
						System.out.println("Invalid Ticket Type");
						break;
					}

				}
				else {
					System.out.println(ticket+" not found");
				}
				break;
			case 3:
				loop = false;
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
		}while(loop == true);
	}
}
