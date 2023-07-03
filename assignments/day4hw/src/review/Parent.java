package review;

public class Parent {
	protected int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public void display() {
		System.out.println("Number: " + num);
	}
}
