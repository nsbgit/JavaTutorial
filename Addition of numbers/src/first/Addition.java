package first;

import java.util.Scanner;

public class Addition
{
	private double[] number = new double[5];
	private double sum;
	private double avg;
	
	Scanner sc = new Scanner(System.in);
	
	
	//Takes input from user
	void inputNumbers()
	{
		System.out.println("Enter five numbers for addition:");
		for(int i=0; i<number.length; i++)
		{
			number[i] = sc.nextDouble();
		}
		
	}
	
	
	//Calculate the sum of the inputed numbers
	void calculation()
	{
		for(double element : number)
		{
			/* Here this is called "for each loop".
			 * here "double" is the data type of the array "number" and the
			 * extracting variable "element". When this for each loop is called
			 * then the elements of the array comes one by another into the
			 * variable "element" like at first index 0 is come then index 1 is
			 * come into the element and so on.
			 * */
			
			
			sum = sum + element;
		}
		
		avg = sum / number.length;
		/* This is "length" variable which is used to
		 * find the length of an array
		 * */
	}
	
	
	//Display the sum of numbers
	void display()
	{
		for(double element : number)
		{
			System.out.println("Number is	:	" + element);
		}
		System.out.println("The sum is	:	" + sum);
		System.out.println("The average is	:	" + avg);
	}
}