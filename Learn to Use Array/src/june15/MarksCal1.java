package june15;

import java.util.Scanner;

public class MarksCal1
{
	private String studentName;
	private int math;
	private int phy;
	private int bio;
	private int total;
	
	Scanner sc = new Scanner(System.in);
	
	void studentInformationInput()
	{
		System.out.println("Enter student name:");
		studentName = sc.nextLine();
		System.out.println("Enter marks of Math:");
		math = sc.nextInt();
		System.out.println("Enter marks of Phycisc");
		phy = sc.nextInt();
		System.out.println("Enter marks of Biology");
		bio = sc.nextInt();
	}
	
	void marksCalculation()
	{
		total = math+phy+bio;
	}
	
	void resultDisplay()
	{
		System.out.println("Student Name is " + studentName);
		System.out.println("Total marks is " + total);
	}

}
