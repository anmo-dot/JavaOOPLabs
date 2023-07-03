package review;

public class StringEqual3 {
	public static void main(String[] args) {
		String name1, name2;
		name1 = "God";
		name2 = name1;
		if(name1.equals(name2)) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}
	}
}

/*
 * Expected: Equal
 * Actual: Equal
 * */
