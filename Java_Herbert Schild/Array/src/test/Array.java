package test;

import java.util.Scanner;

public class Array
{
	Scanner sc = new Scanner(System.in);
	
	int a[] = new int[5];
	
	void input()
	{
		System.out.println("Enter 5 elements :");
		
		for(int i=0;i<5;i++)
		{
			a[i] = sc.nextInt();
		}
	}
	
	
	void display()
	{
		System.out.println("You have entered :");
		for(int i=0; i<5; i++)
		{
			System.out.println(a[i]);
		}
	}

}
