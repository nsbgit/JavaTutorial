package test;

public class DoWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 10;
		
		do {
			System.out.println("tick " + n);
			n--;
		}while(n>0 && n!=10);

	}
}
