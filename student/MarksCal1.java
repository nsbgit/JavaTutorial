package student;

import java.util.Scanner;

class MarksCal1 
{
	private String studentName;
	private int math;
	private int phy;
    private int bio;
	private int total;
	
	Scanner sc = new Scanner(System.in);
	
	void studentInformationInput()
	{
		System.out.println("Enter Student name");
		studentName = sc.nextLine();
		System.out.println("Enter marks of maths");
		math=sc.nextInt();
		System.out.println("Enter marks of phy");
		phy=sc.nextInt();
		System.out.println("Enter marks of bio");
		bio=sc.nextInt();
	}
	
	void marksCalculation()
	{
		total = math+phy+bio;
	}
	
	void resultDisplay()
	{
		System.out.println("Student Name is " + studentName);
		System.out.println("Total marks is "+ total);
	}
}
