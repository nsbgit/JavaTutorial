package second;

import java.util.Scanner;

public class SplitFuncModule
{
	Scanner sc = new Scanner(System.in);
	
	SplitFuncData sfd = new SplitFuncData();
	
	void stringInput()
	{
		System.out.println("Enter a string :");
		sfd.setStr(sc.next());
	}
	
	void spilitingWord()
	{
		//sfd.setStrArray(new String[5]);
		sfd.setStrArray(sfd.getStr().split(" "));
	}
	
	void display()
	{
		for(String element : sfd.getStrArray())
		{
			System.out.println(element);
		}
	}

}
