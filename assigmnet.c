#include <stdio.h>
#include <stdlib.h>

struct student
{
    char stud_name[100];
    char reg_num[100];
    int mark1;
    int mark2;
    int mark3;
    int total;
    struct student *next;
    float average;
};
struct student *head;

int addNewNode();
int readCurrentNode();
int main()
{
    int choice = 0;
    while (choice != 9)
    {
        printf("\n\n****Main Menu****\n");
        printf("\nChoose one option from the following list ...\n");
        printf("\n===============================================\n");
        printf("\n1.Add new Node \n2.Read Current Nodes\n");
        printf("\nEnter your choice?\n");
        scanf("\n%d", &choice);
        switch (choice)
        {
        case 1:
            addNewNode();
            break;
        case 2:
            readCurrentNode();
            break;
        default:
            printf("Please enter valid choice..");
        }
    }
}

int addNewNode()
{
    struct student *s1, *temp;
    char name[100];
    char reg[100];
    int m1, m2, m3;
    int flag = 0;
    s1 = (struct student *)malloc(sizeof(struct student));
    if (s1 == NULL)
    {
        printf("\nOVERFLOW");
    }
    else
    {
        printf("Enter name, registeration number, marks1, marks2, marks3 \n");
        scanf("%s %s %d %d %d", name, reg, &m1, &m2, &m3);
        s1->stud_name = name;
        s1->reg_num = reg;
        s1->mark1 = m1;
        s1->mark2 = m2;
        s1->mark3 = m3;
        if (head == NULL)
        {
            s1->next = NULL;
            head = s1;
        }
        else
        {
            temp = head;
            while (temp->next != NULL)
            {
                if (temp->reg_num == reg)
                {
                    flag = 1;
                }
                temp = temp->next;
            }
            if (flag == 0)
            {
                temp->next = s1;
                s1->next = NULL;
                printf("\nNode inserted");
            }
            else
            {
                printf("\nRegister number already exists");
                free(s1);
            }
        }
    }
}
int readCurrentNode()
{
    struct student *temp1;
    temp1 = head;
    while (temp1->next != NULL)
    {
        printf("\n NAME: %s", temp1->stud_name);
        printf("\n REGISTERATION NUMBER %s", temp1->reg_num);
        printf("\n TOTAL %d", temp1->total);
        printf("\n AVERAGE %f", temp1->average);
        temp1 = temp1->next;
    }
}