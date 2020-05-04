package simple;

import java.util.Scanner;


public class PlaindromeCheckModule
{
	Scanner sc = new Scanner(System.in);
	
	private String name;
	private char[] reverseSt;
	private String characterArrayToString;
	private boolean flag;
	
	void stringInput()
	{
		System.out.println("Enter a string to check plaindrome	:	");
		name = sc.nextLine();
	}
	
	/*void checkPlaindrome()reverseSt
	{reverseSt
		StringBuffer bf = new StringBuffer(name);
		bf.reverseSt();//reverse the string
		
		if(name.equals(bf.toString()))//it converts the StringBuffer to String
			flag = true;
			
	}*/
	
	void reverseArrayCreation()
	{
		reverseSt = new char[name.length()];
	}
	
	void reverseStringCreation()
	{
		int j = name.length() - 1;
		for(int i=0; i<name.length(); i++)
		{
			reverseSt[j] = name.charAt(i);
			j--;
		}
		
		characterArrayToString = String.valueOf(reverseSt);
		System.out.println("Reverse String is	:	" + characterArrayToString);
	}
	void checkPlaindrome1()
	{
		if(name.equals(String.valueOf(reverseSt))) //reverse array converted to string
		{
			flag = true;
		}
	}
	
	
	void displayResult()
	{
		if(flag == true)
			System.out.println(name + " is plaindrome");
		else
			System.out.println(name + " is not plaindrome");
	}
}
