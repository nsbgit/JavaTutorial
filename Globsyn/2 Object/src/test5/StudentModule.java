package test5;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentModule {
	private ArrayList<StudentData> alist = new ArrayList<StudentData>(); //alist object of ArrayList class
	//we can only store object of StudentData class in alist
	Scanner sc = new Scanner(System.in);
	
	private int position;
	private int tempMax;
	
	
	
	void studentInformationInput() {
		StudentData sd; //sd ==> reference
		String rply = null;
		
		
		do {
			sd = new StudentData(); //allocate memory of StudentData class object sd for name,math,phy,chem
			
			System.out.println("Enter the student name :");
			sd.setStudentName(sc.next()); //take ip from user and store data int memory 
			
			System.out.println("Enter the marks of math :");
			sd.setMath(sc.nextInt());
			
			System.out.println("Enter the marks of physics :");
			sd.setPhy(sc.nextInt());
			
			System.out.println("Enter the marks of chemistry :");
			sd.setChem(sc.nextInt());
			
			//we create the object which stores the marks of the subjects and that is then transferred to the ArrayList
			alist.add(sd); //all info in memory location is transferred to ArrayList in 0th position and so on
			
			System.out.println("Do you want to add more? y/n");
			rply = sc.next();
			
		}while(rply.equalsIgnoreCase("y")); //check it is y or not
	}
	
	void marksCalculation() {
		StudentData sd1; //reference ==> sd1
		for(int i=0; i<alist.size(); i++) {
			sd1 = alist.get(i); //At the ith position the contents of the ArrayList is put into sd1.
			sd1.setTotal(sd1.getMath() + sd1.getPhy() + sd1.getChem());
			sd1.setAvg(sd1.getTotal()/3.0);
			//we total the contents by extracting value from the objects and we again put the obj to the arraylist
			alist.set(i,sd1); //at the ith position the values are updated.
		}
	}
	
	void resultDisplay() {
		for(StudentData re : alist) {
			System.out.println("Student Name	:	" + re.getStudentName());
			System.out.println("Total Marks	:	" + re.getTotal());
			System.out.println("Average Marks	:	" + re.getAvg());
		}
	}
	
	
	void highestSearch() {
		tempMax = alist.get(0).getTotal();
		position = 0;
		
		for(int i=1; i<alist.size(); i++) {
			if(tempMax < alist.get(i).getTotal()) {
				tempMax = alist.get(i).getTotal();
				position = i;
			}
		}
	}
	
	void highestDisplay() {
		System.out.println("Topper Name	:	" + alist.get(position).getStudentName());
		System.out.println("Math		:	" + alist.get(position).getMath());
		System.out.println("Physics		:	" + alist.get(position).getPhy());
		System.out.println("Chemistry	:	" + alist.get(position).getChem());
		System.out.println("Total Marks	:	" + alist.get(position).getTotal());
		System.out.println("Average Marks	:	" + alist.get(position).getAvg());
		
	}
}