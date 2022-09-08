#include <stdio.h>
#define N 5

struct practice_one
{
    int student[20];
    int top;
}x;

void push();
void pop();
void display();
void display1();
void faculty();

void display1()
{
    if(x.top==0)
    {
        printf("Data is not Stored Yet\n");
        return;
    }

    printf("The register number of the last submitted record %i\n",x.student[x.top-1]);
}

void pop()
{
    int iteam;
    iteam=x.student[x.top];
    
    if(x.top==-1)
    {
        printf("No Data Left to POP!!\n");
        return;
    }
    printf("Register Number Deleted -->%i\n",iteam);
    --x.top;
}

void push()
{
    int iteam;

    if(x.top == 19)
    {
        printf("Stack is Full!\n");
        return;
    }

    printf("Enter the Registration Number to Add -->\n");
    scanf("%i",&iteam);

    x.student[x.top]=iteam;
    x.top++;
}

void display()
{
    if(x.top<10)
    {
        printf("Enter Details of Atleast 10 Students!!\n");
        return;
    }

    for(int i=0;i<10;i++)
    printf("%i ",x.student[i]);
    printf("\n");
}

void faculty()
{
    int n;

    printf("Enter the Registration Number of the Student -->\n");
    scanf("%i",&n);

    for(int i=0;i<x.top;i++)
    if(x.student[i]==n)
    {
        printf("Yes the Student has Submitted the Assignment!!\n");
        return;
    }

    printf("No the Student has NOT Submitted the Assignment!!\n");
}

int main()
{
    int choice;
    do
    {
        printf("Enter 1 to Add Registration Number\n"); 
        printf("Enter 2 to Display the register number of the last submitted record\n");
        printf("Enter 3 to Display the register number of the ten students who submitted first\n");
        printf("Enter 4 for Any query posed by faculty such as checking if a particular student has submitted the assignment or not\n");
        printf("Enter 5 to Exit\n");
        scanf("%i",&choice);

        switch (choice)
        {
        case 1:
        push();
        break;
        
        case 2:
        display1();
        break;

        case 3:
        display();
        break;
        case 4:
        faculty();
        break;
        }
    } while(choice!=5);
    
}