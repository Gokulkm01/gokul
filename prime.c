#include<stdio.h>
main()
{
    int n,i,flag=0;
    printf("\n enter the value:");
    scanf("%d",&n);
    for(i=2;i<=n/2;i++)
    {
        if(n%i==0)
        {
            flag=1;
            break;
        }
    }
    if(flag==0)
    {
        printf("\n prime");
    }
    else{
        printf("\n not prime");
    }
}
