#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <malloc.h>

int counti = 0;
int countd = 0;

int s = 0;
int a = 0;
int b = 0;
int c = 0;
int d = 0;
int e = 0;
int f = 0;
int n = 0;

struct student
{
    struct student *prev;
    char stud_name[60];
    char reg[10];
    int mark1, mark2, mark3;
    int total;
    float avg;
    char grade;
    struct student *next;

} * head, *ptr, *check, *p1, *p2, *p;

void insert()
{
    struct student *newnode;

    newnode = (struct student *)malloc(sizeof(struct student));
    char s1[20], s2[20];

    printf("Enter Student Name-");
    scanf("%s", s1);
    strcpy(newnode->stud_name, s1);

    printf("Enter Reg. No.-");
    scanf("%s", s2);
    strcpy(newnode->reg, s2);

    int m1, m2, m3;
    printf("Enter Marks 1-");
    scanf("%d", &m1);
    newnode->mark1 = m1;

    printf("Enter Marks 2-");
    scanf("%d", &m2);
    newnode->mark2 = m2;

    printf("Enter Marks 3-");
    scanf("%d", &m3);
    newnode->mark3 = m3;

    newnode->total = (m1 + m2 + m3);

    newnode->avg = newnode->total / 3;

    if (newnode->avg > 91)
    {
        s++;
        newnode->grade = 'S';
    }
    else if (newnode->avg > 81)
    {
        newnode->grade = 'A';
    }
    else if (newnode->avg > 71)
    {
        newnode->grade = 'B';
    }
    else if (newnode->avg > 61)
    {
        newnode->grade = 'C';
    }
    else if (newnode->avg > 51)
    {
        newnode->grade = 'D';
    }
    else if (newnode->avg >= 41)
    {
        newnode->grade = 'E';
    }
    else if (newnode->avg < 41)
    {
        newnode->grade = 'F';
    }
    else
        newnode->grade = 'N';

    n++;
    ptr = head;
    if (ptr == NULL)
    {
        counti++;
        head = newnode;
    }
    else
    {
        ptr = head;
        int flag = 1;
        while (ptr != NULL)
        {
            if (strcmp(newnode->reg, ptr->reg) == 0)
            {
                printf("\n-Duplicate registration number\n");
                flag = 0;

                free(newnode);
                break;
            }
            ptr = ptr->next;
        }
        if (flag == 1)
        {
            counti++;
            ptr = head;
            while (ptr->next != NULL)
            {
                ptr = ptr->next;
            }
            newnode->prev = ptr;
            ptr->next = newnode;
        }
    }
}

void countgrade()
{
    ptr = head;
    while (ptr->next != NULL)
    {
        if (ptr->grade == 'S')
            s++;
        else if (ptr->grade == 'A')
            a++;
        else if (ptr->grade == 'B')
            b++;
        else if (ptr->grade == 'C')
            c++;
        else if (ptr->grade == 'D')
            d++;
        else if (ptr->grade == 'E')
            e++;
        else if (ptr->grade == 'F')
            f++;
        ptr = ptr->next;
    }

    printf("\n The grade count is as follows \n S-%d\n A-%d\n B-%d\n C-%d\n D-%d\n E-%d\n F-%d\n", s, a, b, c, d, e, f);
}

void display()
{

    ptr = head;
    while (ptr != NULL)
    {
        printf("\nDisplaying Linked list\n");
        printf("\nName:%s\n", ptr->stud_name);
        printf("Reg No:%s\n", ptr->reg);
        printf("Mark 1:%d\n", ptr->mark1);
        printf("Mark 2:%d\n", ptr->mark2);
        printf("Mark 3:%d\n", ptr->mark3);
        printf("Total:%d\n", ptr->total);
        printf("Average:%f\n", ptr->avg);

        ptr = ptr->next;
    }
}

void display2(struct student *j)
{

    ptr = j;
    if (ptr == NULL)
    {
        printf("\nEmpty List\n");
    }
    else
    {
        while (ptr != NULL)
        {

            printf("\nName:%s\n", ptr->stud_name);
            printf("Reg No:%s\n", ptr->reg);
            printf("Mark 1:%d\n", ptr->mark1);
            printf("Mark 2:%d\n", ptr->mark2);

            printf("Mark 3:%d\n", ptr->mark3);
            printf("Total:%d\n", ptr->total);
            printf("Average:%f\n", ptr->avg);
            printf("Grade:%c\n", ptr->grade);
            printf("\n*********\n");
            ptr = ptr->prev;
        }
    }
}
struct student *deleteF()
{

    p1 = head;
    while (p1->next != NULL)
        p1 = p1->next;
    if (head->grade == 'F')
    {
        countd++;
        printf("Reg No: %s is Deleted!", head->reg);
        ptr = head;
        head = head->next;
        head->prev = NULL;
        free(ptr);

        return NULL;
    }
    else if (p1->grade == 'F')
    {
        printf("Reg No: %s is Deleted!", p1->reg);
        p1->prev->next = NULL;
        p = p1->prev;
        free(p1);

        return p;
    }
    else
    {
        ptr = head;
        while (ptr->next != NULL)
        {
            if (ptr->grade == 'F')
            {
                printf("Reg No: %s is Deleted!", ptr->reg);
                ptr = ptr->next;
                p1->next = p2;
                p2->prev = p1;
                p = p1;
            }
            else
                ptr = ptr->next;
        }
    }
}
int main()
{
    int size;

    printf("Enter no of student records:\n");
    scanf("%d", &size);
    printf("\npart-a,part-c\n");

    for (int i = 0; i < size; i++)
    {
        insert();
        display();
    }
    countgrade();
    printf("\npart-e,part-f\n");
    struct student *s;
    for (int i = 0; i < f; i++)
    {
        s = deleteF();
        display2(s);
    }

    printf("\npart-d,part-g\n");
}