#include<stdio.h>
#include<malloc.h>
#include<string.h>

struct Student
{
    char student_name[60];
    char reg_num[9];
    int mark1;
    int mark2;
    int mark3;
    double total;
    double avg;
    char grade;

    struct Student *next;
    int check;
};

struct Student *head,*temp,*temp1;
struct Student *nw;

void input();
int verify(char[]);
void traverse_from_start();
void traverse_from_end();
void display(struct Student*);

void input()
{
    int v;   
    temp=nw;
    temp1=temp;

    if(nw->check != -1)
    nw=(struct Student *) malloc(sizeof(struct Student));

    if(nw->check == -1)
    {
        nw->check = 0;

        printf("Enter Name of the Student -->\n");
        scanf("%s",nw->student_name);
        
        printf("Enter Register Number of the Student -->\n");
        scanf("%s",nw->reg_num);
        
        printf("Enter Mark 1 of the Student -->\n");
        scanf("%i",&nw->mark1);

        printf("Enter Mark 2 of the Student -->\n");
        scanf("%i",&nw->mark2);

        printf("Enter Mark 3 of the Student -->\n");
        scanf("%i",&nw->mark3);

        nw->total = nw->mark1 + nw->mark2 + nw->mark3;
        nw->avg = nw->total/3;

        if(nw->avg >90)
        nw->grade = 'S';
        else 
        if(nw->avg >80)
        nw->grade = 'A';
        else 
        if(nw->avg >70)
        nw->grade = 'B';
        else
        if(nw->avg >60)
        nw->grade = 'C';
        else
        if(nw->avg >50)
        nw->grade = 'D';
        else
        if(nw->avg >40)
        nw->grade = 'E';
        else
        nw->grade = 'F';
    }
    else
    {
        printf("Enter Name of the Student -->\n");
        scanf("%s",nw->student_name);

        printf("Enter Register Number of the Student -->\n");
        scanf("%s",nw->reg_num);

        v=verify(nw->reg_num);
        
        if(!(v==0))
        {
            printf("Record Already Submitted! Enter New Students!\n");
            input();
        }

        printf("Enter Mark 1 of the Student -->\n");
        scanf("%i",&nw->mark1);

        printf("Enter Mark 2 of the Student -->\n");
        scanf("%i",&nw->mark2);
        
        printf("Enter Mark 3 of the Student -->\n");
        scanf("%i",&nw->mark3);

        
        nw->total = nw->mark1 + nw->mark2 + nw->mark3;
        nw->avg = nw->total/3;
        
        
        if(nw->avg >90)
        nw->grade = 'S';
        else 
        if(nw->avg >80)
        nw->grade = 'A';
        else 
        if(nw->avg >70)
        nw->grade = 'B';
        else
        if(nw->avg >60)
        nw->grade = 'C';
        else
        if(nw->avg >50)
        nw->grade = 'D';
        else
        if(nw->avg >40)
        nw->grade = 'E';
        else
        nw->grade = 'F';
    }

    temp1->next=nw;
    nw->next=NULL;
}

int verify(char ch[])
{
    temp=head;

    for(;temp!=NULL;temp=temp->next)
    if(strcmp(ch,temp->reg_num) == 0)
    return -1;
    return 0;
}

void traverse_from_start()
{
    temp = head;

    for(;temp!=NULL;temp=temp->next)
    display(temp);
}

void display(struct Student *temp)
{
        printf("Name --> %s\n",temp->student_name);
        printf("Reg Number --> %s\n",temp->reg_num);
        printf("Average Marks -->%f\n",temp->avg);
        printf("Grade -->%c\n\n",temp->grade);
}

void traverse_from_end()
{
    int count=0;
    temp=head;

    for(;temp!=NULL;temp=temp->next,count++);
    
    printf("%i",count);

    for(int i=0;i<count;i++)
    {
        temp=head;
        
        if(count!=1)
        for (int j=0;j<count-i; j++)
        temp=temp->next;

        display(temp);
    }
}

int main()
{
    int n,choice;
    nw=(struct Student *) malloc(sizeof(struct Student));
    head=nw;
    nw->check=-1;
    nw->next=NULL;

    do
    {
        printf("Enter 1 to Fill In Details Of the Student's --> \n");
        printf("Enter 2 to Traverse From First to Last and Display Details-->\n");
        printf("Enter 3 to Traverse From Last to First and Display Details-->\n");
        printf("Enter 4 to Exit!\n");
        scanf("%i",&choice);

        switch (choice)
        {
        case 1:
        input();
        break;

        case 2:
        traverse_from_start();
        break;

        case 3:
        traverse_from_end();
        break;

        }
    } while(choice!=4);
}