package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Employeedetail {
	private ArrayList<EmployeeData> alist = new ArrayList<EmployeeData>();
	Scanner sc = new Scanner(System.in);
	
	void employeeInformationInput() {
		EmployeeData sd;
		String reply;
		do {
			sd= new EmployeeData();
			System.out.println("Enter the employee name");
			sd.setMembersName(sc.next());
			System.out.println("Enter the employee id");
			sd.setid(sc.nextInt());
			System.out.println("Enter the salary of Employee");
			sd.setsal(sc.nextInt());
			alist.add(sd);
			System.out.println("Do u want to add more y/n");
			reply=sc.next();
		}while(reply.equals("y"));
	}
	
	void Display() {
		for(int i =0;i<alist.size();i++) {
			System.out.println("Employee name is : " +alist.get(i).getMembersName());
			System.out.println("Employee id is : " + alist.get(i).getid());
			System.out.println("Employee salary is : " + alist.get(i).getsal());
		}
	}
	
	void search() {
		int i,c=0;
		int s1,s2;
		EmployeeData sd2=new EmployeeData();
		System.out.println("Enter the employee id no:");
		sd2.setEmployeesearch(sc.nextInt());
		for(i=0;i<alist.size();i++) {
			s1=alist.get(i).getid();
			s2=sd2.getEmployeesearch();
			if(s1==s2) {
				c++;
				break;
			}
		}
		if(c==1) {
			System.out.println("VALID");
			System.out.println("Employee Information Display.........");
			System.out.println("Employee name "+alist.get(i).getMembersName());
			System.out.println("Id = "+alist.get(i).getid());
			System.out.println("Salary = "+alist.get(i).getsal());
		}
		else
			System.out.println("NOT VALID");
	}
}
