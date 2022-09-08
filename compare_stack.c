#include <stdio.h>

struct Stack
{
    int a[100];
    int top;
}x;

void push(int q)
{
    x.a[x.top]=q;
    x.top++;
}

int pop()
{
    if(x.top<0)
    {
        printf("Output: 1");
        return -1;
    }
    return x.a[x.top--];
}

int main()
{
    int l;
    printf("Enter the Length of the Array!!");
    scanf("%i",&l);

    int pushed_array[l],poped_array[l];

    printf("Enter Element of Pused Array!");
    for(int i=0;i<l;i++)
    scanf("%i",&pushed_array[i]);

    printf("Enter Element of Poped Array!");
    for(int i=0;i<l;i++)
    scanf("%i",&poped_array[i]);

    push(pushed_array[0]);

    for(int i=0,j=0;i<l;i++)
    {
        if(pop() == poped_array[j])
        ++j;
        else
        push(pushed_array[i]);
    }

    printf("Output: 0");
}
