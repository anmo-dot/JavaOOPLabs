package review;

public class TypeCasting {
	public static void main(String[] args) {
		int intVal = 10;
		double doubleVal = 20.0;
		intVal = (int) doubleVal;
		System.out.println(intVal);
	}
	/*
	 * Expected Output: Type casting error
	 * Actual Output: Java.lang.Error, type mismatch*/
}
