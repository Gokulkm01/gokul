#include<stdio.h>
#include<conio.h>
#include<string.h>
main()
{
    char a[20],*b,*c;
    printf("\n enter the values:");
    scanf("\n %s",&a);
    printf("\n the values are:%s",b=strrev(a));
    printf("\n values are:%s",c=strrev(b));
    getch();
}
