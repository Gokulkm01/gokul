#include<stdio.h>
main()
{
    int res,base,exp;
    printf("\n base:");
    scanf("%d",&base);
    printf("\n exp");
    scanf("%d",&exp);
    res=pow(base,exp);
    printf(" %.1d^%.1d=%.2d",base,exp,res);
}





