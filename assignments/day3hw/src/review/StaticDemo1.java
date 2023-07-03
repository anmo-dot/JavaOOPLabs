package review;

public class StaticDemo1 {
	static int num;
	static void display() {
		System.out.println(num);
	}
	public static void main(String[] args) {
		StaticDemo1.display();
	}
}

/*
 * Expected null
 * Actual:  0
 * */
