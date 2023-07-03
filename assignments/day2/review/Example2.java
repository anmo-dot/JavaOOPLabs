package review;

public class Example2 {
	public static void main(String[] args) {
		int intValOne = 5, intValTwo = 7;
		System.out.println(((intValTwo * 2) % intValOne));
		System.out.println(intValTwo % intValOne);
	}
}
/*
 * Expected Output: 8 2
 * Actual Output: 4 2
 * */
