#include <stdbool.h>
#include <stdio.h>

struct lift
{
    int order[20];
    int top;
}x;

void push(int,int);
void pop(int,int);

void push(int temp,int c)
{
    if(c<0)
    return;

    if(temp==c)
    for(int j=0;j<=c;j++)
    {
        for(int z=0;z<10e8;z++);
        printf("Floor : %i \n",j);
    }
    else if(temp<c)
    for(int j=temp;j<=c;j++)
    {
        for(int z=0;z<10e8;z++);
        printf("Floor : %i \n",j);
    }

    printf("Reached Floor --> %i\n",c);
}

void pop(int temp,int c)
{
     for(int j=temp;j>=c;j--)
    {
        for(int z=0;z<10e8;z++);
        printf("Floor : %i \n",j);
    }
}

int main()
{
    int ch=0,temp=0,n;

    printf("Enter Number of People!\n");
    scanf("%i",&n);

    int p[n],q[n];

    if(n>20)
    {
        printf("People Exceed!!!");
        return 0;
    }

    int i,temp2,p1=0,q1=0,tempp;

    do
    {
        printf("Enter your Desired Floor Number!!\n");
        printf("1    2    3\n4    5    6\n7    8    9\n     0\n");

        for(int j=0;j<n;j++)
        scanf("%i",&x.order[j]);

        for(int i=0;i<n;i++)
        {
            int y=x.order[i];
            for(int j=i+1;j<n;j++)
            {
                if(y==x.order[j])
                x.order[j]=-1;
            }
        }

        for(int i=0;i<n;i++)
        for(int j=0;j<n;j++)
        {
            if(x.order[i]<x.order[j])
            {
                int t = x.order[i];
                x.order[i]=x.order[j];
                x.order[j]=t;
            }
            
        }
       
        for(int i=0;i<n;i++)
        {
            push(temp,x.order[i]);
            temp=x.order[i];
        }
        printf("\n\n");
    }while (true);
    
}