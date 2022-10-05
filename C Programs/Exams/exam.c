#include <stdio.h>

int fun(int,int);

int main()
{
    printf("%i",fun(0,0));
}

int fun(int a,int b)
{
    if(1>a && 1>a)
    {
        b+=2;
        a=2+a+b;
        a=1+1+b;
        return fun(b,b)-a;
    }
    b=3+a+a;
    return a;
}