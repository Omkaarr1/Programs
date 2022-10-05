#include <stdio.h>
#include <malloc.h>
#include <string.h>

struct Student
{
    char stud_name[60];
    char reg_num[10];
    int mark1;
    int mark2;
    int mark3;
    int total;
    float average;
    char grade;

    struct Student *next;
};

struct Student *nw, *head, *tail, *temp,*temp1;
static int count = 0;

void insertion()
{
    count++;
    char stud_name[60];
    char reg_num[10];
    int mark1;
    int mark2;
    int mark3;
    int total;
    float average;
    char grade;

    printf("Enter Student Name -->\n");
    scanf("%s", stud_name);

    printf("Enter Reg Number -->\n");
    scanf("%s", reg_num);

    printf("Enter Mark 1 -->\n");
    scanf("%s", &mark1);

    printf("Enter Mark 2 -->\n");
    scanf("%s", &mark2);

    printf("Enter Mark 3 -->\n");
    scanf("%s", &mark3);

    total = mark1 + mark2 + mark3;
    average = total / 3;

    if (average >= 90 && average <= 100)
        grade = 'S';
    else if (average >= 80 && average < 90)
        grade = 'A';
    else if (average >= 70 && average < 80)
        grade = 'B';
    else if (average >= 60 && average < 70)
        grade = 'C';
    else if (average >= 50 && average < 60)
        grade = 'D';
    else if (average >= 40 && average < 50)
        grade = 'E';
    else
        grade = 'F';

    if (count == 1)
    {
        nw->mark1 = mark1;
        nw->mark2 = mark2;
        nw->mark3 = mark3;
        nw->average = average;
        nw->total = total;
        nw->grade = grade;
        strcpy(nw->reg_num, reg_num);
        strcpy(nw->stud_name, stud_name);
    }
    else
    {
        nw = (struct Student *)malloc(sizeof(struct Student));
        nw->mark1 = mark1;
        nw->mark2 = mark2;
        nw->mark3 = mark3;
        nw->average = average;
        nw->total = total;
        nw->grade = grade;
        strcpy(nw->reg_num, reg_num);
        strcpy(nw->stud_name, stud_name);

        if (count % 2 == 0)
        {
            nw->next = head;
            if(count == 2)
            temp1=head;
            head = nw;
            tail->next=head;
        }
        else
        {
            if(count==3)
            temp1->next=nw;
            nw->next = head;
            tail->next=nw;
            tail=nw;
        }
    }
}

void display()
{
    temp = head;
    do
    {
        printf("%s ",temp->stud_name);
        temp=temp->next;
    } while (temp!=head);
    printf("\n");
}

int main()
{
    nw = (struct Student *)malloc(sizeof(struct Student));
    nw->mark1 = nw->mark2 = nw->mark3 = -1;
    int choice;
    head = nw;
    tail = nw;
    nw->next = NULL;

    do
    {
        printf("Enter 1 to Add Node\n");
        printf("Enter 2 to Display Node\n");
        scanf("%i", &choice);

        switch (choice)
        {
        case 1:
            insertion();
            break;

        case 2:
            display();
            break;
        }
    } while (choice != 3);
}