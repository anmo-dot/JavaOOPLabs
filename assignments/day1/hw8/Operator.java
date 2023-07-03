package hw8;

public class Operator {
	public static void main(String[] args) {
		int intVal = 100;
		byte byteVal = (byte) intVal;
		byte max = 127;
		byte min = -128;
		byte sum = (byte)(max + min);
		
		
		System.out.println("Sum = " + sum);
	}
}

// Output error: java.lang.Error > type mismatch : cannot convert from int to byte
//		Conversion for intVal from int to byte did work, but the addition of the min and max did not work becuase it
//		the sum binary operation returns an integer every time, so it has to be cast to a byte e.g. (byte) max + min
