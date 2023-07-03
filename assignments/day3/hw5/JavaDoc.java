package hw5;

import java.util.Scanner;

public class JavaDoc {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter username: ");
		String user = s.next();
		System.out.println("length of username: "+user.length());
		System.out.println("Hi "+user);
		System.out.println(user.toLowerCase());
		System.out.println(user.toUpperCase());
		if(user.startsWith("a")) {
			System.out.println(user+" starts with a");
		}
		user = "SEED";
		System.out.println("New user name: "+user);
	}
}
