package std1;

import java.util.Scanner;

public class StudentModule 
{
	private StudentData stdobj = new StudentData();
	
	Scanner sc = new Scanner(System.in);
	
	void studentInformationInput()
	{
		System.out.println("Enter student name:");
		stdobj.setStudentName(sc.nextLine());
		
		System.out.println("Enter marks of Math:");
		stdobj.setMath(sc.nextInt());
		
		System.out.println("Enter marks of Phycisc");
		stdobj.setPhy(sc.nextInt());
		
		System.out.println("Enter marks of Biology");
		stdobj.setBio(sc.nextInt());
		
	}
	
	
	void marksCalculation()
	{
		stdobj.setTotal(stdobj.getMath() + stdobj.getPhy() + stdobj.getBio());
	}
	
	void resultDisplay()
	{
		System.out.println("Student Name is " + stdobj.getStudentName());
		System.out.println("Total marks is " + stdobj.getTotal());;
	}

}
