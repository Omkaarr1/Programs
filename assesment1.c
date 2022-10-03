#include<stdio.h>
#include<malloc.h>
#include<string.h>
#include<stdbool.h>

struct node 
{
	char stud_name[60];
	char reg_num[10];
	int mark1,mark2,mark3,total;
	float average;
	char grade;
	struct node *next;
};

struct node *nw,*temp,*head,*tempcheck,*listabove90,*tempdelition;
bool check(char*);
int counthead,countdeletitation;
void insert();
bool check(char*);
void display(struct node *);
void displayFromBegining();
void displayFromEnd();
void studentsAbove90();
void printNewList(struct node*);

void insert()
{
	char stud_name[60];
	char reg_num[10];
	int mark1,mark2,mark3,total;
	float average;
	char grade;
	
	printf("Enter Student Name -->\n");
	scanf("%s",stud_name);
	
	printf("Enter Register Number -->\n");
	scanf("%s",reg_num);

	printf("Enter Mark 1 -->\n");
	scanf("%i",&mark1);

	printf("Enter Mark 2 -->\n");
	scanf("%i",&mark2);
	
	printf("Enter Mark 3 -->\n");
	scanf("%i",&mark3);

	average = (mark1+mark2+mark3)/3;

	if(average > 90)
	grade = 'S';
	else if(average > 80 && average <= 90)
	grade = 'A';
	else if(average > 70 && average <= 80)
	grade = 'B';
	else if(average > 60 && average <= 70)
	grade = 'C';
	else if(average > 50 && average <= 60)
	grade = 'D';
	else
	grade = 'F';

	if(nw->mark1 == -1)
	{
		strcpy(nw->stud_name,stud_name);
		strcpy(nw->reg_num,reg_num);
		nw->mark1=mark1;
		nw->mark2=mark2;
		nw->mark3=mark3;
		nw->average=average;
		nw->grade=grade;
		nw->next=NULL;
	}
	else 
	{
		temp=nw;
		nw = (struct node *)malloc(sizeof(struct node));

		if(check(reg_num))
		{
			printf("Record Already Found!!\n");
			return;
		}

		strcpy(nw->stud_name,stud_name);
		strcpy(nw->reg_num,reg_num);
		nw->mark1=mark1;
		nw->mark2=mark2;
		nw->mark3=mark3;
		nw->average=average;
		nw->grade=grade;
		nw->next=NULL;
		temp->next=nw;
	}
}

bool check(char *stud_name)
{
	tempcheck=head;

	for(;tempcheck!=NULL;tempcheck=tempcheck->next)
	if(!strcmp(stud_name,tempcheck->reg_num))
	return true;

	return false;
}

void display(struct node *temp)
{
	printf("Name --> %s\n",temp->stud_name);
	printf("Register Number --> %s\n",temp->reg_num);
	printf("Mark 1 --> %i\n",temp->mark1);
	printf("Mark 2 --> %i\n",temp->mark2);
	printf("Mark 3 --> %i\n",temp->mark3);
	printf("Average --> %f\n",temp->average);
	printf("Grade --> %c\n",temp->grade);
}

void displayFromBigining()
{
	temp=head;

	for(;temp!=NULL;temp=temp->next)
	display(temp);
}

void displayFromEnd()
{
	int count=0;
	
	for(temp=head;temp!=NULL;temp=temp->next,count++);

	for(int i=0;i<count;i++)
	{
		temp=head;

		for(int j=0;j<count-i;j++,temp=temp->next);
		display(temp);
	}
}

void studentsAbove90()
{
	temp=head;

	int flag=0;
	listabove90 = (struct node *)malloc(sizeof(listabove90));

	for(;temp!=NULL;temp=temp->next)
	{
		if(flag == 0 && temp->average>90)
		{
			listabove90 = temp;
			listabove90->next=NULL;
			
		}
		else
		{
			tempcheck=listabove90;
			listabove90 = (struct node *)malloc(sizeof(listabove90));
			tempcheck->next=listabove90;
			listabove90->next=NULL;
		}
	}

	printNewList(listabove90);
	printf("\n\n\n");
	displayFromBigining();
}


void printNewList(struct node *listabove90)
{
	temp=listabove90;

	for(;temp!=NULL;temp=temp->next)
	display(temp);
}

int main()
{
	int choice=-1;

	nw = (struct node *)malloc(sizeof(struct node));
	head=nw;
	nw->next=NULL;
	nw->mark1=-1;

	do
	{
		printf("Enter 1 to Insert Node -->\n");
		printf("Enter 2 to Display From Bigning -->\n");
		printf("Enter 3 to Display From End -->\n");
		printf("Enter 4 to Display Student Abouve 90 -->\n");
		scanf("%i",&choice);

		switch (choice)
		{
		case 1:
		insert();
		break;
		case 2:
		displayFromBigining();
		break;
		case 3:
		displayFromEnd();
		break;
		case 4:
		studentsAbove90();
		break;
		}
	} while (choice!=0);
}