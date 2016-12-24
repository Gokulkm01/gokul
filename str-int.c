#include<stdio.h>
#include<stdlib.h>
main()
{
    int i;
    char num[256];
    printf("\n enter the value: ");
    gets(num);
    i=atoi(num);
    printf("\n the values are:%d",i);
    getch();
}
