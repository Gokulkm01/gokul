#include<stdio.h>
#include<conio.h>
main()
{
    int factorial,n,i;
    factorial=1;
    printf("\n enter the values:");
    scanf("%d",&n);
    for(i=1;i<=n;i++)
    {
         factorial=factorial*i;
    }
    printf("\n values of %d is %d",n,factorial);
}
