#include<stdio.h>
main()
     {

         int i,n,a;
         printf("\n enter the num:");
         scanf("%d",&n);
         for(i=n;i>=1;i--)
         {
             for(a=0;a<i;a++)
             {
                 printf("*");
             }printf("\t");
             for(a=1;a<=i;a++)
             {
                 printf("*");
             }

         printf("\n");
     }
     }
