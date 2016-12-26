#include<stdio.h>
#include<conio.h>
main()
{
    int add=1,i,j;
    printf("\n enetr the values:");
    for(i=2;i<=500;++i)
    {
        for(j=2;j<=i/2;j++)
        {
            if((i%j)!=0)
                continue;
            add=add+i;
        }
        if(add==j)
            printf("\n %d",j);
        add=1;
    }
    getch();

}
