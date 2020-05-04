package student;

import java.util.Scanner;

public class StudentCreation 
{
	private MarksCal1 studentArray[];
	private int studentNumber;
	
	Scanner sc = new Scanner(System.in);
	
	void inputStudentNumber()
	{
		System.out.println("Enter the Student Number");
		studentNumber = sc.nextInt();
	}	
	
	void studentArrayCreation()
	{
		studentArray = new MarksCal1[studentNumber];
	}
	
	void studentOjbectCreation()
	{
		for(int i=0; i<studentArray.length;i++)
		{
			studentArray[i]= new MarksCal1();
		}
	}
	
	void studentInfoInput()
	{
		for(int i=0; i<studentArray.length;i++) 
		{
			
			studentArray[i].studentInformationInput();
		}
	}
	
	void studentMarks()
	{
		for(int i=0; i<studentArray.length;i++)
		{
			studentArray[i].marksCalculation();
		}
	}
	
	void studentDisplay()
	{
		for(int i=0; i<studentArray.length;i++)
		{
		  studentArray[i].resultDisplay();
		}
	}
}
