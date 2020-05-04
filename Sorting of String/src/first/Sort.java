package first;

import java.util.Scanner;

public class Sort
{
	private String[] nameStr;
	private String temp;
	private int arraySize;
	
	Scanner sc = new Scanner(System.in);
	
	void inputArraySize()
	{
		System.out.println("Enter the number of names	:	");
		arraySize = sc.nextInt();
	}
	
	void arrayCreation()
	{
		nameStr = new String[arraySize];
	}
	
	void inputString()
	{
		System.out.println("Enter the strings :");
		for(int i=0; i<nameStr.length; i++)
		{
			nameStr[i] = sc.next();
		}
	}
	
	void inputedStringDisplay()
	{
		System.out.println("You have entered :");
		for(int i=0; i<nameStr.length; i++)
		{
			System.out.println(nameStr[i]);
		}
	}
	
	void sortString()
	{
		for(int i=1; i<nameStr.length; i++)
        {
            for(int j=0; j<nameStr.length-i; j++)
            {
                if(nameStr[j].compareTo(nameStr[j+1])>0)
                {
                    temp=nameStr[j+1];
                    nameStr[j+1]=nameStr[j];
                    nameStr[j]=temp;
                }
            }
        }
	}
	
	
	void display()
	{
		System.out.println("The names in alphabetical order are : ");
        for(int i=0; i<nameStr.length; i++)
        {
            System.out.println(nameStr[i]+ " ");
        }
	}

}
