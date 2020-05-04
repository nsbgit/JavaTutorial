package test4;

import java.util.Scanner;

public class StudentModule {
	//private StudentData stdObj = new StudentData();
	private StudentData[] stdArray; // reference creation
	/*
	 * inform compiler studentArray[] will be created
	 * and within that objects of MarksCal1 will be
	 * also created and store according to the position
	 * number of array.
	 *  */
	
	Scanner sc = new Scanner(System.in);

	private int studentNumber; //This will take student number as user input

	private int temp;

	private int position;
	
	// It will take input of how many partition will be created in that array
	void inputStudentNumber() {
		System.out.println("Enter the number of student : ");
		studentNumber = sc.nextInt();
	}
	
	// It will create the array (not object) but there will be no memory allocation for that because it is a reference till now
	void studentArrayCreation() {
		stdArray = new StudentData[studentNumber];
		/*
		 * be careful it only creates only array but it
		 * doesn't create or assign any object in it
		 * */
	}
	
	// It will create object and will allocate memory for each and every positional object
	void studentObjectCreation() {
		for(int i=0; i< stdArray.length; i++) {
			stdArray[i] = new StudentData();
			/*
			 * Now it will create object in each position of array
			 * */
		}
	}
	
	void printArrayLength() {
		System.out.println("stdArray.length ---> " + stdArray.length);
	}
	
	void studentInformationInput() {
		for(int i=0; i<stdArray.length; i++) {
			System.out.println("Enter student name:");
			//stdObj.setStudentName(sc.nextLine());
			stdArray[i].setStudentName(sc.next());
			
			System.out.println("Enter marks of Math:");
			//stdObj.setMath(sc.nextInt());
			stdArray[i].setMath(sc.nextInt());
			
			
			System.out.println("Enter marks of Phycisc");
			//stdObj.setPhy(sc.nextInt());
			stdArray[i].setPhy(sc.nextInt());
			
			System.out.println("Enter marks of Biology");
			//stdObj.setBio(sc.nextInt());
			stdArray[i].setBio(sc.nextInt());
		}
	}
	
	void marksCalculation() {
		//stdObj.setTotal(stdObj.getBio() + stdObj.getMath() + stdObj.getPhy());
		for(int i=0; i<stdArray.length; i++) {
			stdArray[i].setTotal(stdArray[i].getMath() + stdArray[i].getPhy() + stdArray[i].getBio());
		}
	}
	
	void display() {
		for(int i=0; i<stdArray.length;i++) {
			System.out.println("Name	:	" + stdArray[i].getStudentName());
			System.out.println("Maths	:	" + stdArray[i].getMath());
			System.out.println("Physics	:	" + stdArray[i].getPhy());
			System.out.println("Biology	:	" + stdArray[i].getBio());
			System.out.println("Total	:	" + stdArray[i].getTotal());
		}
	}
	
	void highestSearch() {
		temp = stdArray[0].getTotal();
		position = 0;
		for(int i=1; i< stdArray.length; i++) {
			if(temp > stdArray[i].getTotal()) continue;
			else {
				temp = stdArray[i].getTotal();
				position = i;
			}
		}
	}
	
	void highestDisplay() {
		System.out.println("Topper name	:	" + stdArray[position].getStudentName());
		System.out.println("Maths		:	" + stdArray[position].getMath());
		System.out.println("Physics		:	" + stdArray[position].getPhy());
		System.out.println("Biology		:	" + stdArray[position].getBio());
		System.out.println("Total		:	" + stdArray[position].getTotal());
	}
}
