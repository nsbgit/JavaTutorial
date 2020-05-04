package june13;

import java.util.*;

public class Avg
{
	private String studentName;
	private int mth;
	private int phy;
	private int chem;
	private int sum;
	private double avg;
	
	
	Scanner sc = new Scanner(System.in);
	
	
	void studentInformationInput()
	{
		System.out.println("Enter student name");
		studentName = sc.nextLine();
		System.out.println('Enter marks of math:');
		math = sc.nextInt();
		System.out.println('Enter marks of phy:');
		math = sc.nextInt();
		System.out.println('Enter marks of math:');
		math = sc.nextInt();
	}
	
	
	/*void ip()
	{
		System.out.println("Enter the numbers :\n");
		System.out.println("Math");		
		mth = sc.nextInt();

		System.out.println("Physics");
		phy = sc.nextInt();

		System.out.println("Chemistry");
		chem = sc.nextInt();
	}*/
	
	void calc()
	{
		sum = mth+phy+chem;
		avg = sum/3.0;
	}
	
	
	void disp()
	{
		System.out.println("Sum = "+sum);
		System.out.println("Avg = "+avg);


	}

}
