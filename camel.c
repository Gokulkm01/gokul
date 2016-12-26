#include<stdio.h>
#include<conio.h>
main()
{
    char a[30];
    int i;
    printf("\n enter the str:");
    scanf("%s",a);
    for(i=0;i<=a[i]!='\0';i++)
    {
        if(a[0]>='a'&&a[0]<='z')
        a[0]=a[0]-32;
    }
    printf("\n camel statement is:%s\t",a);
}
