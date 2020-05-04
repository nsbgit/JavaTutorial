#include<stdio.h>

int main()
{
	int i,j,flag=0;
	char ch;
	
	for(j=1; j<=10; j++)
	{
		for(i=2;i<=j;++i)
		{
			if(j%i==0)
			{
				flag=1;
			//	printf("%d -----------> %c\n\n",j,j);
			 //	break;
			}
		}
		if (flag==0)
		printf("%d is a prime number.\n",j);
		
	}
	
	return 0;
}