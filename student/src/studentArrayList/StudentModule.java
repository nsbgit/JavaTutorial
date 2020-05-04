package studentArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentModule
{
	private ArrayList<StudentData> alist = new ArrayList<StudentData>();
	
	Scanner sc = new Scanner(System.in);
	
	void studentInformationInput()
	{
		StudentData sd;
		String reply;
		do
		{
			sd = new StudentData();
			
			System.out.println("Enter student name : ");
			sd.setStudentName(sc.next());
			System.out.println("Enter Math : ");
			sd.setMath(sc.nextInt());
			System.out.println("Enter Phy : ");
			sd.setPhy(sc.nextInt());
			System.out.println("Enter Bio : ");
			sd.setBio(sc.nextInt());
			alist.add(sd);
			System.out.println("Do you want to add more? y/n: ");
			reply = sc.next();
		}
		while(reply.equals("y"));
	}
	
	
	void marksCalculation()
	{
		StudentData sd1;
		for(int i=0;i<alist.size();i++)
		{
			sd1 = alist.get(i);
			sd1.setTotal(sd1.getMath()+sd1.getPhy()+sd1.getBio());
			alist.set(i, sd1);
		}
	}
	
	
	void resultDisplay()
	{
		for(int i=0;i<alist.size();i++)
		{
			System.out.println("Student Name is : " + alist.get(i).getStudentName());
			System.out.println("Total is : " + alist.get(i).getTotal());
		}
	}

}
