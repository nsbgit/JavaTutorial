package test;

import java.util.Scanner;

public class FibonacciModule {
	int number;
	
	Scanner sc = new Scanner(System.in);
	
	void setData(){
		System.out.println("\nEnter the number of fibonacci series:");
		number = sc.nextInt();
	}
	
	int fibonacciCalculation(int number){
		if(number == 0 || number == 1)
			return 1;
		else
			return((fibonacciCalculation(number-1)) + fibonacciCalculation(number - 2));
	}
}
