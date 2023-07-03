package review;

class Cat extends Animal{
	public void testClassMethod() {
		System.out.println("The class method in Cat");
	}
	public void testInstanceMethod()	{
		System.out.println("The Instance method in Cat");
	}
	public static void main(String[] args) {
		Cat myCat = new Cat();
		Animal myAnimal = myCat;
		myAnimal.testClassMethod();
		myAnimal.testInstanceMethod();
	}
}

/*
 * Actual: Java.lang.error: The abstract method testClassMethod in type Animal can only set a visibility modifier, one of public or protected
 * */
