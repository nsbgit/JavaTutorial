package test;

/**
 * Demonstrate an inner class
 * @author Sukanta
 *
 */

public class OuterClass {
	int outerX = 100;
	
	void test() {
		InnerClass inner = new InnerClass();
		inner.display();
	}
	
	// this is an inner class
	class InnerClass {
		void display() {
			System.out.println("Display : outerX = " + outerX);
		}
	}
}
