package review;

public class TestCount implements Count{
	public static void main(String[] args) {
		TestCount test = new TestCount();
		test.countUp();
	}
	public void countUp() {
		//can change final variable counter
		// therefore created new variable
		int j = counter;
		for(int x = 6; x > j; x--, ++j) {
			System.out.println(" "+counter);
		}
	}
}
/*
 * Java lang error: interface variables are final, and can't be assgined
 */