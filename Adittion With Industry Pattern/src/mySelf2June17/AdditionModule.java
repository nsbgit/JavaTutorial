package mySelf2June17;

import java.util.Scanner;

public class AdditionModule
{
	Scanner sc = new Scanner(System.in);
	
	private AdditonData obj = new AdditonData();
	
	//Takes the size of array i.e. how many numbers will be added
	void arraySizeInput()
	{
		System.out.println("Enter how many numbers you want to add	:	");
		obj.setArraySize(sc.nextInt());
	}
	
	
	void arrayCreation()
	{
		obj.setValue(obj.getArraySize());
	}
	
	//Takes input the numbers
	void inputNumber()
	{
		for(int i=0; i< obj.getValue().length; i++)
		{
			obj.setValue(v1);
		}
	}

}
