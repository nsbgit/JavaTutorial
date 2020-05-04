package june14;

import java.util.*;

public class BubbleSort
{
	private int n = 3;
	private int a[]= new int[5];
	private static int temp;
	
	Scanner sc = new Scanner(System.in);
	
	
	void ip()
	{
		System.out.println("Enter the numbers for sorting:");
		
		for(int i = 0;i<n;i++)
		{
			a[i]= sc.nextInt();			
		}
	}
	
	
	void cal()
	{
		for(int j =0;j<n-1;j++)
		{
			for(int i=0;i<n-i-1;i++)
			{
				if(a[j]>a[j+1])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
	
	
	void display()
	{
		System.out.println("After Sorting:");
		
		for(int i = 0;i<n;i++)
		{
			System.out.println(a[i]);			
		}
	}

}
