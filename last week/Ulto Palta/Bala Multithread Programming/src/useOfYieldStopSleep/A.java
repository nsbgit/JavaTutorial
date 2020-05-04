package useOfYieldStopSleep;

public class A extends Thread {
	public void run() {
		for(int i = 1; i <= 5; i++) {
			if(i == 1) yield();
			System.out.println("\t\tFrom Thread A\t:\ti = " + i);
		}
		System.out.println("Exit from A ------------->");
	}
}
