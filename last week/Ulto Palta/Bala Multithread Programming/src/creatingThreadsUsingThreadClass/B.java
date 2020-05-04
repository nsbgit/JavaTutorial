package creatingThreadsUsingThreadClass;

public class B extends Thread {
	public void run() {
		for(int j = 1; j <= 5; j++) {
			System.out.println("\tFrom Thread B\t:\tj = " + j);
		}
		System.out.println("Exit from B ------------->");
	}
}
