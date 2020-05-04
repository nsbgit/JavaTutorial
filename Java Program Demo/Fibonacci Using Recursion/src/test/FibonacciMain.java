package test;

public class FibonacciMain {
	public static void main(String[] args) {
		FibonacciModule obj = new FibonacciModule();
		obj.setData();
		System.out.println();
		System.out.println(obj.fibonacciCalculation(obj.number));
		
	}

}
