package creatingThreadsUsingThreadClass;

public class A extends Thread {
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("\tFrom Thread A\t:\ti = " + i);
		}
		System.out.println("Exit from A ------------->");
	}
}
