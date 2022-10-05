#include <stdio.h>

struct Stack
{
    int p[100];
    int top;
}x;

void push(int c)
{
    x.p[x.top]=c;
    x.top++;
}

int pop()
{
    int c=x.p[x.top-1];
    x.top--;
    return c;
}

int main()
{
    int l,flag=0;

    printf("Enter length of Array\n");
    scanf("%i",&l);

    int a1[l],a2[l],store[2*l];

    printf("Enter Pushed Array!!\n");
    
    for(int i=0;i<l;i++)
    scanf("%i",&a1[i]);

    printf("Enter Popped Array!!\n");
    
    for(int i=0;i<l;i++)
    scanf("%i",&a2[i]);

    printf("Enter the Order of Push and Pop Performed!\n");
    printf("1 For Push\n2 For Pop\n");

    for(int i=0;i<2*l;i++)
    scanf("%i",&store[i]);

    for(int i=0,c1=0,c2=0;i<2*l;i++,c1++)
    {
        if(store[i]==1)
        push(a1[c1]);
        else if(store[i]==2)
        {
            if(pop()!=x.p[x.top])
            {    
                flag=1;
                break;
            }
        }
    }

    if(flag==0)
    printf("Ouptut: 1");
    else
    printf("Output: 0");
}