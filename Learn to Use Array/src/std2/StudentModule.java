package std2;

import java.util.Scanner;


public class StudentModule 
{
	private int studentNumber;
	//private StudentData stdobj = new StudentData();
	private StudentData[] stdarray;
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
		stdarray = new StudentData[studentNumber];
	}
	
	
	void studentObjectCreation()
	{
		for(int i = 0; i < stdarray.length; i++)
		{
			stdarray[i] = new StudentData();
		}		
	}
	
	
	
	void studentInformationInput()
	{
		for(int i=0; i<stdarray.length;i++)
		{
			System.out.println("Enter student name:");
			//stdobj.setStudentName(sc.nextLine());
			stdarray[i].setStudentName(sc.next());
		
			System.out.println("Enter marks of Math:");
			//stdobj.setMath(sc.nextInt());
			stdarray[i].setMath(sc.nextInt());
		
			System.out.println("Enter marks of Phycisc");
			//stdobj.setPhy(sc.nextInt());
			stdarray[i].setPhy(sc.nextInt());
		
			System.out.println("Enter marks of Biology");
			//stdobj.setBio(sc.nextInt());
			stdarray[i].setBio(sc.nextInt());
		}
		
	}
	
	
	void marksCalculation()
	{
		for(int i=0; i<stdarray.length;i++)
		{
			
			//stdobj.setTotal(stdobj.getMath() + stdobj.getPhy() + stdobj.getBio());
			stdarray[i].setTotal(stdarray[i].getMath() + stdarray[i].getPhy() + stdarray[i].getBio());
		}
		
	}
	
	
	void resultDisplay()
	{
		for(int i=0; i<stdarray.length;i++)
		{
			System.out.println("Student Name is " + stdarray[i].getStudentName());
			System.out.println("Total marks is " + stdarray[i].getTotal());
		}
	}
	
	
	void studentHighestSearch()
	{
			temp = stdarray[0].getTotal();
			for(int i=1; i<stdarray.length;i++)
			{
				if(temp > stdarray[i].getTotal())
					continue;
				else
					temp = stdarray[i].getTotal();
				position = i;
			}
	}
	
	
	void studentHighestDisplay()
	{
		System.out.println("The name of topper is : " + stdarray[position].getStudentName());
		System.out.println("Math : " + stdarray[position].getMath());
		System.out.println("Physics : " + stdarray[position].getPhy());
		System.out.println("Biology : " + stdarray[position].getBio());
		System.out.println("Total : " + stdarray[position].getTotal());
		
	}
	
	

}
