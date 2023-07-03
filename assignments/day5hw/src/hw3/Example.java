package hw3;

public class Example implements InterOne{
	// interface methods must be public
	public void methodOne() {
		//Cannot reassign variables in interface
		//varTwo = varTwo+10;
		//int var = varTwo+10;
		System.out.println("Value of varTwo: "+varTwo);
		System.out.println("Good Morning");
	}
	public void methodTwo() {
		System.out.println("Good Afternoon");
	}
}
