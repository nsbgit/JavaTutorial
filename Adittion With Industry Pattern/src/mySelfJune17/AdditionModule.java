package mySelfJune17;

import java.util.Scanner;

public class AdditionModule
{
	Scanner sc = new Scanner(System.in);
	
	//It creates an object of AdditionData class
	private AdditionData obj = new AdditionData();
	
	//Behavior for taking data input
	void dataInput()
	{
		System.out.println("Enter the first value	:	");
		obj.setFirstValue(sc.nextDouble());
		/*
		 * 1. sc.nextDouble() takes the input from user
		 * 2. obj.setFirstValue call the function of obj object of AdditionData class
		 * 3. The above function passes the input value as argument which first copy in f1
		 *    variable in AdditionData class then the value assign to firstValue variable
		 * */
		System.out.println("Enter the second value	:	");
		obj.setSecondValue(sc.nextDouble());
	}
	
	//Calculates the sum
	void calculation()
	{
		obj.setResult(obj.getFirstValue() + obj.getSecondValue());
	}
	/*
	 * Instruction to use set and get
	 * 1. Use set instead of = i.e. to assign value
	 * 2. Use get to print or use the variable
	 * */
	
	
	//Displays the result
	void display()
	{
		System.out.println("Result is	:	" + obj.getResult());
	}

}
