#include<stdio.h>

char a(char b[])
{
    int i,j,c=strlen(b),e=strlen(b);

    for(i=strlen(b)-1;i>=0;i--)
    {   c--;
        if(b[i]==' ')
        {
            for(j=c;j<e;j++)
                printf("%c",b[j]);
            e=c;
        }
        if(i==0)
        {
            printf(" ");
            for(j=c;j<e;j++)
                printf("%c",b[j]);
            break;
        }
    }
}
void main()
{
    char g[20],n;
    int s;
    gets(g);
    a(g);

}
