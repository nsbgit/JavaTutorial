package useOfYieldStopSleep;

public class ThreadMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		A threadA = new A();
		B threadB = new B();
		C threadC = new C();
		
		System.out.println("Start thread A");
		threadA.start();
		System.out.println("Start thread B");
		threadB.start();
		System.out.println("Start thread C");
		threadC.start();
		System.out.println("End of main thread -------->");
	}

}
