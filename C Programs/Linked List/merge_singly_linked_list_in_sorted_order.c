#include <stdio.h>
#include <malloc.h>

struct stack
{
    char a[1000];
    int top;
}x;

void push(char ch)
{
    x.top++;
    x.a[x.top] = ch;
}

int pop()
{
    int temp=x.a[x.top];
    x.top--;
    return temp;
}

int main()
{
    char ch[100],c;
    int i=0,open=0,close=0;
    x.top=-1;

    printf("Enter the Expression!\n");
    scanf("%s",ch);
    do
    {
        if(ch[i] == '(' || ch[i] == ')' || ch[i] == '<' || ch[i] == '>' || ch[i] == '{' || ch[i] == '}')
        push(ch[i]); 
        i++;   
    } while (ch[i]!='\0');

    do
    {
        c=pop();
       if(c == '(' || c == '<'|| c == '{')
       open++;

       if(c == ')' || c == '>' || c == '}')
       close++;

    } while (x.top!=-1);

    if(open == close)
    printf("Balanced!\n");
    else
    printf("Not Balanced!\n");

    return 0;
}

