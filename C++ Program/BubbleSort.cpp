/*		WRITE A PROGRAM OF SORTING USING BUBBLE SORT		*/

#include<stdio.h>
#include<conio.h>
#define MAX 100

int main()
{
	int array[MAX],i,j,k,n,temp,xchanges,pass;
	
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
	
	/*It is the two basic for loop for BUBBLE SORT*/
	for(i=0; i<n-1; i++)
	{
		xchanges = 0;
		for(j=0; j<n-1-i; j++)
		{
			if(array[j] > array[j+1])
			{
				temp = array[j];
				array[j] = array[j+1];
				array[j+1] = temp;
				xchanges++;
			}
		}
		pass = i+1;
		if(xchanges == 0)
		{
			pass = i;
			break;
		}
		
		printf("\n\nArray after PASS %d :\n",(i+1));
		printf("===================================\n");
		for(k=0; k<n; k++)
		{
			printf("\n\tArray[%d] = %d",k,array[k]);
		}
		
		printf("\n\nNumber of swap operation in this pass:\t%d",xchanges);
	}
	
	/*It will show the array after SELECTION sorting*/
	printf("\n\nArray after SELECTION sorting :\n");
	printf("===================================\n");
	for(i=0; i<n; i++)
	{
		printf("\n\tArray[%d] = %d",i,array[i]);
	}
	
	printf("\n\nNumber of pass:\t%d",pass);
	
	getch();
	return 0;
}
