//Display Two Stack in One Array
#include<stdio.h>

struct two_stack_in_one_array
{
    int a[20];
    int top1;
    int top2;
}x;

void push1();
void push2();
void pop1();
void pop2();
void display1();
void display2();

void push1()
{
    int iteam;
    
    if(x.top1==9)
    {
        printf("Stack Full!!\n");
        return;
    }

    printf("Enter a Number to Push!!\n");
    scanf("%i",&iteam);

    x.a[x.top1]=iteam;
    x.top1++;

    printf("Pushed!!\n");
}

void push2()
{
    int iteam;
    
    if(x.top2==19)
    {
        printf("Stack Full!!\n");
        return;
    }

    printf("Enter a Number to Push!!\n");
    scanf("%i",&iteam);

    x.a[x.top2]=iteam;
    ++x.top2;
    printf("Pushed!!\n");
}

void pop1()
{
    if(x.top1==0)
    {
        printf("Stack is Empty!!\n");
        return;
    }

    int iteam;

    x.top1--;
    iteam = x.a[x.top1];
    printf("Element Deleted --> %i\n",iteam);
}

void pop2()
{
    if(x.top2==9)
    {
        printf("Stack is Empty!!\n");
        return;
    }

    int iteam;

    x.top2--;
    iteam = x.a[x.top2];

   

    printf("Element Deleted --> %i\n",iteam);
}

void display1()
{
    if(x.top1==0)
    {
        printf("Stack is Empty\n");
        return;
    }

    for(int i=0;i<x.top1;i++)
    printf("%i ",x.a[i]);
    printf("\n");
}

void display2()
{
    if(x.top2==9)
    {
        printf("Stack is Empty\n");
        return;
    }

    for(int i=9;i<x.top2;i++)
    printf("%i ",x.a[i]);
    printf("\n");
}


int main()
{
    int choice;

    x.top2=9;

    do
    {
    printf("Enter 1 to Push in Array 1!\n");
    printf("Enter 2 to Push in Array 2!\n");
    printf("Enter 3 to Pop in Array 1!\n");
    printf("Enter 4 to Pop in Array 2!\n");
    printf("Enter 5 to Display Array 1!\n");
    printf("Enter 6 to Display Array 2!\n");
    printf("Enter 7 to Exit!\n");
    scanf("%i",&choice);

    switch (choice)
    {
    case 1:
    push1();
    break;

    case 2:
    push2();
    break;
    
    case 3:
    pop1();
    break;
    
    case 4:
    pop2();
    break;
    
    case 5:
    display1();
    break;
    
    case 6:
    display2();
    break;

    default:
        break;
    }
    }while(choice!=7);
    return 0;
}