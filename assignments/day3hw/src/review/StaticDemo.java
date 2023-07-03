package review;

public class StaticDemo {
	static int count = 10;
	StaticDemo(){
		count++;
	}
	static void display() {
		System.out.println(count);
	}
	static {
		System.out.println("Static Block written before Main");
	}
	public static void main(String[] args) {
		StaticDemo t1 = new StaticDemo();
		StaticDemo t2 = new StaticDemo();
		StaticDemo.display();
		t2.display();
	}
	static {
		System.out.println("Static Block written after Main");
	}
}

/*
 * Expected Static Block written before Main
			Static Block written after Main
			12
			12
 * Actual:  Static Block written before Main
			Static Block written after Main
			12
			12
 * */
