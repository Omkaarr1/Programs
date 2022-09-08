#include<stdio.h>
#include<string.h>

int main()
{
    char p[1000];
    int k;

    printf("Enter the Text!!\n");
    scanf("%s",p);

    printf("Enter the Value of K\n");
    scanf("%i",&k);

    for (int i = 0; i < strlen(p); i++)
    {
        char ch=p[i];
        
        for(int j=1;j<=k;j++)
        {
        ch+=1;
        if(ch == '[')
        ch='A';
        }

        p[i]=ch;
    }

    for(int i=0;i<strlen(p);i++)
    printf("%c",p[i]);
}