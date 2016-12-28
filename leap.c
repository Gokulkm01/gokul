#include<stdio.h>
main()
{
    int a;
    printf("\n enter the year:");
    scanf("%d",&a);
    if(a%400==0){
        printf("\n it is a leap year:");
    }
    else if(a%4==0){
        if(a%100==0)
    {
        printf("\n it is not a leap year:");

    }
    else{printf("\n it is  leap yr:");}
}
else {printf("\n it is not leap yr");}
}
