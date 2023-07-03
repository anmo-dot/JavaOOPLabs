package review;

public class TestInterface {
	public static void main(String[] args) {
		InheritClass inclass = new InheritClass();
		inclass.printParentOne();
		inclass.printParentTwo();
		inclass.printChild();
	}
}

/*
 * Expected: 1 2 3
 * Actual: 1 2 3 
 * */
