package mySelfJune16;

import java.util.Scanner;

public class StudentCreation 
{
	private MarksCal1 studentArray[];
	/*
	 * inform compiler studentArray[] will be created
	 * and within that objects of MarksCal1 will be
	 * also created and store according to the position
	 * number of array.
	 *  */
	private int studentNumber;//This will take student number as user input
	private int temp;
	private int position;
	
	Scanner sc = new Scanner(System.in);
	
	
	void inputStudentNumber()
	{
		System.out.println("Enter the student number");
		studentNumber = sc.nextInt();
	}
	
	
	void studentArrayCreation()
	{
		studentArray = new MarksCal1[studentNumber];
		/*
		 * be careful it only creates only array but it
		 * doesn't create or assign any object in it
		 * */
	}
	
	
	void studentObjectCreation()
	{
		for(int i = 0; i < studentArray.length; i++)
		{
			studentArray[i] = new MarksCal1();
			/*
			 * Now it will create object in each position of array
			 * */
		}		
	}
	
	
	void studentInfoInput()
	{
		for(int i=0; i<studentArray.length; i++)
		{
			studentArray[i].studentInformationInput();
		}
	}
	
	
	
	
	void studentMarks()
	{
		for(int i=0; i<studentArray.length; i++)
		{
			studentArray[i].marksCalculation();
		}
	}
	
	
	void studentDisplay()
	{
		for(int i=0; i<studentArray.length; i++)
		{
			studentArray[i].resultDisplay();
		}
	}
	
	
	void studentHighestSearch()
	{
			temp = studentArray[0].searchHighest();
			for(int j=1; j<studentArray.length;j++)
			{
				if(temp > studentArray[j].searchHighest())
					continue;
				else
					temp = studentArray[j].searchHighest();
				position = j;
			}
	}
	
	
	void studentHighestDisplay()
	{
		System.out.println("The name of topper is : ");
		studentArray[position].highestDisplay();
		
	}
}

