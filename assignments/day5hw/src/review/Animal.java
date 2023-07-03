package review;

abstract class Animal {
	// static methods cannot be abstract
	abstract void testClassMethod();
	public void testInstanceMethod() {
		System.out.println("The instance method in Animal");
	}
}
