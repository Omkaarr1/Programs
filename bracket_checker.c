#include <stdio.h>
#include <string.h>

struct stack
{
    char ch[10000];
    int top1;
    int top2;
}x;

void push(char c)
{
    x.top1++;
    x.ch[x.top1]=c;
}

int main()
{
    x.top1=-1;
    char ch[10000];
    int flag=0;

    printf("Enter the String -->\n");
    scanf("%s",ch);


    
    for(int i=0;i<strlen(ch);i++)
    if(ch[i] == '(' || ch[i] == ')' || ch[i] == '<' || ch[i] == '>' || ch[i] == '{' || ch[i] == '}')
    push(ch[i]);
    
    x.top2=x.top1-1;

    for(;x.top2>=0;x.top2-=2,x.top1-=2)
    {
        if(x.ch[x.top1] == ')' ||x.ch[x.top1] == '>' || x.ch[x.top1] == '}')
        if(!(x.ch[x.top2] == '(' ||x.ch[x.top2] == '<' || x.ch[x.top2] == '{'))
        {
            flag=-1;
            break;
        }

        if(x.ch[x.top1] == '(' ||x.ch[x.top1] == '<' || x.ch[x.top1] == '{')
        if((x.ch[x.top2] == ')' ||x.ch[x.top2] == '>' || x.ch[x.top2] == '}'))
        {
            flag=-1;
            break;
        }
        
        if(x.ch[x.top1] == '(' ||x.ch[x.top1] == '<' || x.ch[x.top1] == '{')
        if(x.ch[x.top2] == '(' ||x.ch[x.top2] == '<' || x.ch[x.top2] == '{')
        {
            flag=-1;
            break;
        }
        
    }

    if(flag==0)
    printf("Valid Input!");
    else
    printf("Invalid Input!");
}