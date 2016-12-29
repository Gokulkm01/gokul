#include<stdio.h>
#include<conio.h>
int main()
{
 int i;
 char str[100],str1[100];
 printf("Enter any string : ");
 gets(str);
 gets(str1);
 for(i=0; str[i]!='\0'  && str1[i]!='\0' ;i++)
   printf("%c\n%c",str[i],str1[i]);
 getch();
}
