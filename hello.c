#include <stdlib.h>
#include <string.h>
#include <stdio.h>
// static int countdelete=0;
// static int counthead=0;
static int count = 0;
struct Student
{
    char stud_name[100];
    char regno[100];
    int mark1;
    int mark2;
    int mark3;
    float average;
    char grade;
    struct Student *next;
};
struct Student *head = NULL;

void insert(char *name, char *reg, int m1, int m2, int m3, float avg, char gd, int c)
{
    printf("%d\n", c);
    struct Student *temp = head;
    struct Student *check = head;
    int a;
    struct Student *s1 = (struct Student *)malloc(sizeof(struct Student));
    strcpy(s1->stud_name, name);
    strcpy(s1->regno, reg);
    s1->mark1 = m1;
    s1->mark2 = m2;
    s1->mark3 = m3;
    s1->average = avg;
    s1->grade = gd;
    if (head == NULL)
    {
        head = s1;
        s1->next = head;
        printf("first node inserted\n");
    }
    else
    {
        printf("Enter your choice of position\n");
        scanf("%d", &a);
        switch (a)
        {
        case 1:
            s1->next = head;
            head = s1;
            break;
        case 2:
            temp = head;
            while (temp->next != head)
            {
                temp = temp->next;
            }
            temp->next = s1;
            s1->next = head;
            break;
        }
    }
}

void display()
{
    struct Student *temps = head;
    if (head == NULL)
        printf("\nList is empty\n");
    else
    {
        do
        {
            printf("Registration no. %s\n", temps->regno);
            printf("Name: %s\n", temps->stud_name);
            printf("Mark1 %d\n", temps->mark1);
            printf("Mark2 %d\n", temps->mark2);
            printf("Mark3 %d\n", temps->mark3);
            printf("Average %f\n", temps->average);
            printf("Grade %c\n", temps->grade);
            temps = temps->next;
        } while (temps != NULL);
    }
}

int main()
{
    head = NULL;
    int choice;
    char name[100];
    char regno[100];
    int mark1, mark2, mark3;
    float average;
    char grade;
    printf("1. To insert student details\n2. To display student details\n");
    do
    {
        printf("\nEnter Choice: ");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            printf("Enter mark1: ");
            scanf("%d", &mark1);
            printf("Enter mark2: ");
            scanf("%d", &mark2);
            printf("Enter mark3: ");
            scanf("%d", &mark3);
            printf("Enter name: ");
            scanf("%s", name);
            printf("Enter register number ");
            scanf("%s", regno);
            average = (mark1 + mark2 + mark3) / 3.0;
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
            count++;
            insert(name, regno, mark1, mark2, mark3, average, grade, count);
            break;
        case 2:
            display();
            break;
        default:
            printf("Wrong choice\n");
        }
    } while (choice != 0);
}