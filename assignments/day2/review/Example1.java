package review;

public class Example1 {
	public static void main(String[] args) {
		int intValOne = 0;
		int intValTwo = 0;
		for(short index = 0; index < 5; index++) {
			if((++intValOne)>2 || (++intValTwo >2)) {
				intValOne++;
			}
		}
		System.out.println(intValOne+" "+intValTwo);
	}
	/*
	 * Expected Output: 8 2
	 * Actual Output: 8 2
	 * */
}
