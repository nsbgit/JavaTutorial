package second;

import java.util.Scanner;


public class Addition
{
	private double[] number;//just name of array, doesn't create array
	private int arraySize;
	private double sum;
	private double avg;
	
	Scanner sc = new Scanner(System.in);
	
	
	//Takes array size of number[] from user(i.e. how many numbers user want to add)
	void inputArraySize()
	{
		System.out.println("Enter how many numbers you want to add:");
		arraySize = sc.nextInt();
	}
	
	//Takes input from user
	void inputNumbers()
	{
		System.out.println("Enter five numbers for addition:");
		for(int i=0; i<number.length; i++)
		{
			number[i] = sc.nextDouble();
		}
		
	}
	
	
	//Creates array
	void arrayCreation()
	{
		number = new double[arraySize];
	}
	
	
	//Calculate the sum of the inputed numbers
	void calculation()
	{
		for(double element : number)
		{
			sum = sum + element;
		}
		
		avg = sum / number.length;
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