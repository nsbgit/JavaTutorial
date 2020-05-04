/*
 * 3.	Create a class Emp having members id, name, salary from the user,
 * 		if user makes a wrong entry show a message �Invalid Entry� or print
 * 		�Valid Employee�.
 * 
 * */


package prog3;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Emp {
	private String name;
	private String id;
	private double salary;
	
	private Scanner sc = new Scanner(System.in);
	private boolean flagName;
	private boolean flagID;
	private boolean flagSalary;
	
	private void setData() {
		System.out.println("================================");
		System.out.println("Enter the following information:");
		System.out.println("================================");
		
		System.out.println("\nEnter name of the employee:");
		name = sc.next();
		
		System.out.println("Enter ID of the employee (maximum 5 alphabet):");
		id = sc.next();
		
		System.out.println("Enter salary of the employee (in round figure):");
		salary = sc.nextDouble();
	}
	
	private void validationCheck() {
		/**
		 * Validation check --> name
		 */
	     
	     String namePattern = "^[A-Za-z]";
	     Scanner   scan  =  new Scanner( name ) ;
	     String   matched  =  scan.findInLine( namePattern ) ;
	     if( matched == null )	flagName = false;
	     else	flagName = true;
	     
	     /**
	      * Validation check --> id
	      */
	     
	     String idPattern = "^[A-Za-z0-9]{5}";
	     Scanner scan1 = new Scanner(id);
	     String matched1 = scan1.findInLine(idPattern);
	     if(matched1 == null)	flagID = false;
	     else	flagID = true;
	     
	     /**
	      * Validation check --> salary
	      */
	     
	     String salaryPattern = "^[0-9]";
	     Scanner scan2 = new Scanner(Double.toString(salary));
	     String matched2 = scan2.findInLine(salaryPattern);
	     if(matched2 == null)	flagSalary = false;
	     else	flagSalary = true;
	}
	
	private void display() { 
		if(flagName == true) {
			if(flagID == true) {
				if(flagSalary == true) {
					System.out.println("Valid Entry");
				}
				else System.out.println("Invalid Salary");
			}
			else System.out.println("Invalid ID");
		}
		else System.out.println("Invalid Name");
	}
}