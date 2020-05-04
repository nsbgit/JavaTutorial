package useOfYieldStopSleep;

public class B extends Thread {
	public void run() {
		for(int j = 1; j <= 5; j++) {
			if(j == 3) stop();
			System.out.println("\t\tFrom Thread B\t:\tj = " + j);
		}
		System.out.println("Exit from B ------------->");
	}
}
