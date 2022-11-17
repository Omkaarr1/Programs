#include <stdio.h>

struct stack
{
	int forward[100];
	int backward[100];
	int top1 = -1;
	int top2 = -1;
	int webpagenumber = 0;
}x;

void push1();
void push12();
void push2();
int pop1();
int pop2();

void push1()
{
	x.webpagenumber++;
	x.top1++;
	x.forward[x.top1] = x.webpagenumber;
}

int pop1()
{
	return x.forward[x.top1--];
}

void push12()
{
	int web = pop2();
	x.top1++;
	x.forward[x.top1] = web;
}

int pop2()
{
	return x.backward[x.top2--];	
}

void push2()
{
	int web = pop1();
	x.top2++;
	x.backward[x.top2] = web;
}

void print()
{
	int i=0;
	
	printf("Elements in Forward Stack -->\n");
	
	for(i=0;i<=x.top1;i++)
	printf("%i ",x.forward[i]);
	
	printf("\n");
	
	printf("Elements in Backword Stack -->\n");
	
	for(i=0;i<=x.top2;i++)
	printf("%i ",x.backward[i]);
	
	printf("\n");
}

int main()
{
	int choice=0;
	
	do
	{
		printf("Enter 1 to Go Forward\n");
		printf("Enter 2 to Go Backward\n");
		printf("Enter 3 to Print Elements of the Stack\n");
		printf("Enter 4 to Exit\n");
		scanf("%i",&choice);
		
		switch(choice)
		{
			case 1:
				if(x.top2>-1)
				push12();
				else
				push1();
				break;
			printf("Moved Forward!\n");
			
			case 2:
				push2();
				break;
			
			case 3:
				print();
				break;
				
			default:
				printf("Please Enter Correct Choice!!\n");
		}
		printf("Currently on Web Page %i\n",x.forward[x.top1]);
		
	}while(choice!=4);
}