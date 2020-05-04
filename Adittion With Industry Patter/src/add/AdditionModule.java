package add;

import java.util.Scanner;

public class AdditionModule 
{
	Scanner sc = new Scanner(System.in);
	
	private AdditionData obj = new AdditionData();//create the object of AdditionData class
	
	void dataInput()
	{
		System.out.println("Enter first value:");
		obj.setFirstvalue(sc.nextDouble());
		/*
		 * sc.nextDouble()  reads the value from user
		 * and passing it as a argument and set this value to First value
		 * */
		
		System.out.println("Enter second value:");
		obj.setSecondvalue(sc.nextDouble());
		
	}
	
	
	void calculation()
	{
		obj.setResult(obj.getFirstvalue() + obj.getSecondvalue());
	}
	/*
	 * set i  for =
	 * get is for print or use
	 * */
	
	
	void display()
	{
		System.out.println("Result is " + obj.getResult());
	}
	
	
	
	

}
