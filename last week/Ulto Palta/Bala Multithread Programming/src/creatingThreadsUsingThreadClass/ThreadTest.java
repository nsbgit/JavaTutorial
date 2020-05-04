package creatingThreadsUsingThreadClass;

public class ThreadTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new A().start();
		new B().start();
		new C().start();
		
		/*
		 * 
		 * We can write the following code will work as the same above
		 * 
		 * 
		A threadA = new A();
		B threadB = new B();
		C threadC = new C();
		
		threadA.start();
		threadB.start();
		threadC.start(); 
		 */
	}

}
