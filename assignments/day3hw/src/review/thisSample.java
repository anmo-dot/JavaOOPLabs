package review;

public class thisSample {
	public static void main(String[] args) {
		Square square = new Square();
		square.display(5);
		int area = square.calculateArea();
		System.out.println("The area of the Square is : " +area);
	}
}

/*
 * Expected: Error (unsure which one)
 * Actual: Java.Lang.Error: no enclosing instance of type accessible
 * After moving Squre to own file
 * 	Expected: 25
 * 	Actual: 25
 * */
