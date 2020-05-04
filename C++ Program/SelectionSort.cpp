/*		WRITE A PROGRAM OF SORTING USING SELECTION SORT		*/

#include<stdio.h>
#include<conio.h>
#define MAX 100

int main()
{
	int array[MAX],i,j,n,temp,min;
	
	/*It will take the number of or size of array as user input*/
	printf("\nEnter the numbers of element :\n");
	scanf("%d", &n);
	printf("\nThe array size is :  %d",n);
	
	/*It will take the elements of an array form user*/
	printf("\n\nEnter the values of the array to be sorted with SELECTION SORT :\n");
	for(i=0; i<n; i++)
	{
		printf("\n\tArray[%d] = ",i);
		scanf("%d", &array[i]);
	}
	
	/*It will show the array before sorting*/
	printf("\n\nArray before sorting :\n");
	printf("==========================\n");
	for(i=0; i<n; i++)
	{
		printf("\n\tArray[%d] = %d",i,array[i]);
	}
	
	/*It is the two basic for loop for SELECTION SORT*/
	for(i=0; i<n-1; i++)
	{
		/*Now it will find the index of smallest number*/
		min = i;
		for(j=i+1; j<n; j++)
		{
			if(array[min] > array[j])
			{
				min = j;
			}
		}
		
		/*To avoid swapping of an element with itself*/
		if(i != min)
		{
			temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}
	}
	
	/*It will show the array after SELECTION sorting*/
	printf("\n\nArray after SELECTION sorting :\n");
	printf("===================================\n");
	for(i=0; i<n; i++)
	{
		printf("\n\tArray[%d] = %d",i,array[i]);
	}
	
	getch();
	return 0;
}