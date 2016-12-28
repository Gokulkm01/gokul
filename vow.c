#include<stdio.h>
main()
{
    char ch;
    printf("\n enter the char:");
    scanf("%c",&ch);
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
    {
        printf("\n it is vowel");

    }
    else{
            printf("\n it is consonent");
    }
}
