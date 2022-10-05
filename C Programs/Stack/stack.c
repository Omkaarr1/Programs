#include <stdio.h>

struct stack
{
    int a[100];
    int top;
}x;

void push()
{
    int item;

    printf("Enter Element to Push -->\n");
    scanf("%i",&item);

    x.top++;

    x.a[x.top]=item;

}

void pop()
{
    if(x.top == -1 )
    {
        printf("Stack Empty\n");
        return;
    }

    printf("Poped Element -->%i\n",x.a[x.top]);
    x.top--;
}

void display()
{
    int i=0;

    if(x.top == -1 )
    {
        printf("Stack Empty\n");
        return;
    }

    for(;i<=x.top;i++)
    printf("%i ",x.a[i]);
    printf("\n");
}

int main()
{
    int choice;
    
    x.top=-1;

    do
    {
    printf("Enter 1 to Push\n");
    printf("Enter 2 to Pop\n");
    printf("Enter 3 to Display\n");
    printf("Enter 4 to Exit\n");
    scanf("%i",&choice);

    switch (choice)
    {
    case 1:
    push();
    break;

    case 2:
    pop();
    break;

    case 3:
    display();
    break;
    }

    } while(choice!=4);
    
}
