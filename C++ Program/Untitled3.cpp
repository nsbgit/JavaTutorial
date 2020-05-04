#include<stdio.h>
#include<conio.h>
int main()
{
    int n=2, count=0;                  //count variable store the number of prime number
    int i, m;
    printf("enter the number upto which you want to find prime numbers : ");
    scanf("%d",&m);
    //printf("prime numbers are : \n");
    while(n<m)
    {
        for(i=2; i<n; i++)
        {
        if(n%i==0)
        goto t;                             // goto is referring to line or code 't'
        }
    //printf("\t%d \n", n);
    
    printf("\n\n\n\n%d -----------> %c\n\n\n\n",i,i);
    count++;
    t : n++;                                    //when goto is executed it will directly jump to this statement
    }
    printf("\n\nNumber of prime numbers are %d\n",count);
    getch();
}