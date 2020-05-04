package june14;

import java.util.Scanner;

public class ArrayCreation
{
	//private int a[] = new int[5];
	private int a[];
	private int value;
	private boolean flag;
	private int p;
	private int asize;
	
	Scanner sc =new Scanner(System.in);
	
	
	ArrayCreation()
	{
		flag = false;
	}
	
	void arraySizeInput()
	{
		System.out.println("Enter the array size:");
		asize = sc.nextInt();
	}
	
	
	void arrayCreation()
	{
		a = new int[asize];
	}
	
	
	void arrayValueInput()
	{
		System.out.println("Enter values:");
		
		for(int i = 0;i<asize;i++)
		{
			a[i] = sc.nextInt();
		}
	}
	
	
	void arrayDisplay()
	{
		
		for(int k : a)
		{
			System.out.println("Array is "+k/*a[i]*/);
		}
	}
	
	
	void searchValueInput()
	{
		System.out.println("Enter the number for search:");
		value = sc.nextInt();
	}
	
	
	void search()
	{
		for(int i = 0;i<asize;i++)
		{
			if(a[i] == value)
			{
				flag = true;
				p = i;
				break;
			}
		}
	}
	
	
	void searchResultDisplay()
	{
		if(flag)
		{
			System.out.println("The item is found");
			System.out.println("Position number is "+p);
		}
		else
			System.out.println("Not found");
	}

}
