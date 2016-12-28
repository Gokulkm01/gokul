#include<stdio.h>
#include<conio.h>
main()
{
    int i;
    printf("\n enter the values:");
    scanf("%d",&i);
    if(i>0)
    {
        printf("\n it is pos",i);

    }
    else if(i<0)
    {
        printf("\n neg",i);

    }
    else if(i==0)
    {
        printf("\n zero",i);
    }
}
