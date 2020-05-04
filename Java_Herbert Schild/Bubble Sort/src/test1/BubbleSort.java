package test1;

import java.util.*;

public class BubbleSort
{
	Scanner sc = new Scanner(System.in);
	
	private int[] a = new int[10];
	
	void input()
	{
		System.out.println("\nEnter 5 integers :\n");
		
		for(int i=0; i<5; i++)
		{
			a[i] = sc.nextInt();
		}
	}
	
	void bubbleSort()
	{
		for(int i=0; i<5; i++)
		{
			int xchanges = 0;
			
			for(int j=0; j<5-1-i; j++)
			{
				if(a[j] > a[j+1])
				{
					int temp;
					
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					
					xchanges++;
				}
			}
			
			if(xchanges == 0)
			{
				System.out.println("the list is sorted." + xchanges);
				break;
			}
		}
		
	}
	
	
	void display()
	{
		System.out.println("\nThe array sorted in ascending order is :\n");
		
		for(int i=0; i<5; i++)
		{
			System.out.println("a[" + i + "]--> " + a[i]);
		}
	}
}
