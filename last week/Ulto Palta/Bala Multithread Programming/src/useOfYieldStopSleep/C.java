package useOfYieldStopSleep;

public class C extends Thread {
	public void run() {
		for(int k = 1; k <= 5; k++) {
			System.out.println("\t\tFrom Thread C\t:\tk = " + k);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				/*
				// TODO Auto-generated catch block
				e.printStackTrace();
				*/
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			}
		}
		System.out.println("Exit from C ------------->");
	}
}
