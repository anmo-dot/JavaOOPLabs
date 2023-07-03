package review;

public class Child extends Parent {
	private int val;

	public int getVal() {
		return val;
	}

	public void setVal(int num) {
		this.val = num;
	}
	
	@Override
	public void display() {
		System.out.println("Number: " + num);
		System.out.println("Value: " + val);
	}
}
