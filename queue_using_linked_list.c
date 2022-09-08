#include<stdio.h>
#include<malloc.h>

struct node
{
    int data;
    struct node *next;
};

struct  node *front,*rear,*temp,*nw;

void creation()
{
    int item;

    temp=front;

    printf("Enter the Item -->\n");
    scanf("%i",&item);

    if(temp->data == -1)
    temp->data=item;
    else
    {
        nw=(struct node *)malloc(sizeof(struct node *));
        nw->data=item;
        nw->next=NULL;
        rear->next=nw;
        rear=nw;
    }
}

void display()
{
    temp=front;

    for(;temp!=NULL;temp=temp->next)
    printf("%i ",temp->data);
    printf("\n");
}

int main()
{
    nw=(struct node*) malloc(sizeof(struct node));
    nw->data=-1;
    nw->next=NULL;
    front = nw;
    rear = nw;

    int choice;

    do
    {
        printf("Enter 1 to Insert\nEnter 2 To Display\nEnter 3 to Exit\n");
        scanf("%i",&choice);

        switch (choice)
        {
        case 1:
        creation();
        break;
        
        case 2:
        display();
        break;

        case 3:
        continue;

        default:
        printf("Enter Correct Choice!!\n");
        break;
        }    
    } while (choice!=3);
    
}