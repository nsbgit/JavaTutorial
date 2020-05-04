package test1;

import java.util.Scanner;

public class SelectionSort
{
	private int elementNumber;
	private int[] arr;
	private int min;
	private int temp;
	
	Scanner sc = new Scanner(System.in);
	
	/**
	 * It will enter the number of element
	 */
	void inputElementNumber()
	{
		System.out.println("\nEnter number of element for sorting :\n");
		elementNumber = sc.nextInt();
	}
	
	/**
	 * It will create the array for the entered element number
	 */
	void arrArrayCreation()
	{
		arr = new int[elementNumber];
	}
	
	/**
	 * It will take input and store in the array
	 */
	void arrArrayInput()
	{
		System.out.println("\n\nEnter " + elementNumber + " numbers :\n");
		for(int i=0; i<elementNumber; i++)
		{
			arr[i] = sc.nextInt();
		}
	}
	
	/**
	 * It will show the inputed array before sorting
	 */
	void displayBeforeSorting()
	{
		System.out.println("\n\nArray before sorting using SELCTION SORT :\n");
		for(int i=0; i<elementNumber; i++)
		{
			System.out.println("arr[" + i + "] ---> " + arr[i]);
		}
	}
	
	/**
	 * It will sort the numbers using SELCTION SORT
	 */
	void selectionSort()
	{
		for(int i=0; i<elementNumber-1; i++)
		{
			//find the index of the smallest number
			min = i;
			for(int j=i+1; j<elementNumber; j++)
			{
				if(arr[min] > arr[j])
				{
					min=j;
				}
			}
			
			if(i!=min)
			{
				temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
			
			/**
			 * It will print the array after every pass
			 */
			System.out.println("\n\nArray after pass " + (i+1) + " :\n");
			for(int k=0; k<elementNumber; k++)
			{
				System.out.println("arr[" + k + "] ---> " + arr[k]);
			}
		}
	}
	
	/**
	 * It will show the array after sorting using SELCTION SORT
	 */
	void displayAfterSorting()
	{
		System.out.println("\n\nArray after sorting using SELCTION SORT :\n");
		for(int i=0; i<elementNumber; i++)
		{
			System.out.println("arr[" + i + "] ---> " + arr[i]);
		}
	}
}
