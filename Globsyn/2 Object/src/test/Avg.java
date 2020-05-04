package test;

import java.util.Scanner;

public class Avg {
	private int maths;
	private int phy;
	private int chem;
	private int total;
	private double avg;
	
	// creating object for input using Scanner class
	Scanner sc = new Scanner(System.in);
	
	// it will take input from the user
	void input() {
		System.out.println("Enter the marks of Maths : ");
		maths = sc.nextInt();
		
		System.out.println("Enter the marks of Physics : ");
		phy = sc.nextInt();
		
		System.out.println("Enter the marks of Chemistry : ");
		chem = sc.nextInt();
	}
	
	// it will calculate the sum and average
	void calculation() {
		total = maths + phy + chem;
		avg = total/3.0;
	}
	
	// it will display
	void display() {
		System.out.println("Maths		:	" + maths);
		System.out.println("Physics		:	" + phy);
		System.out.println("Chemistry	:	" + chem);
		System.out.println("Total		:	" + total);
		System.out.println("Average		:	" + avg);
		
	}
}
