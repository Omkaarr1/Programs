#include <stdio.h>
#include <string.h>

int main()
{
    char p[1000];
    int k;

    printf("Enter the Text!!\n");
    scanf("%s",p);

    printf("Enter the Value of K\n");
    scanf("%i",&k);

    for (int i = 0,c; i < strlen(p); i++)
    {
        char ch=p[i];
        c=ch-64;
        for(int j=1;j<=k;j++,c++)
        {
            if(c==26)
            {
                ch='A';
                c=1;
                continue;
            }
            ch+=1;
        }
        p[i]=ch;
    }

    for(int i=0;i<strlen(p);i++)
    printf("%c",p[i]);
}