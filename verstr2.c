#include<stdio.h>
#include<conio.h>
int main()
{
 int i;
 char str[100];
 printf("Enter any string : ");
 gets(str);
 for(i=0; str[i]!='\0' ;i++)
        printf("%c\n%c",str[i],str[0]);
 getch();
}
