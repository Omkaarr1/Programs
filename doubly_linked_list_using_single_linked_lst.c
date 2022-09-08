#include<stdio.h>
#include<malloc.h>

struct node 
{
    int data;
    struct node **next;
};

struct node *head,*tail,*temp,*nw,*container;

void creation()
{
    int item;
    printf("Enter the Item\n");
    scanf("%i",&item);

    if(head->data=-1)
    head->data=item;
    else
    {
        nw=(struct node *)malloc(sizeof(struct node));
        nw->data=item;
        container=*(nw->next);
        *(container->next)=tail;
        nw->next=NULL;
        tail=nw;
    }
}

void display()
{
    temp=head;

    for(;temp->next!=NULL;temp=*temp->next)
    printf("%i ",temp->data);

    printf("\n");
}

void display_from_end()
{
    temp=tail;

    for(;*(temp->next)!=NULL;temp=*(temp->next))
    printf("%i ",temp->data);

    printf("\n");
}

int main()
{
    nw=(struct node *)malloc(sizeof(struct node));
    nw->data=-1;
    nw->next=NULL;
    *(nw->next)=NULL;
    head=nw;
    tail=nw;
    int choice;

    do
    {
        printf("Enter 1 to Insert\nEnter 2 to Display\nEnter 3 to Display from End\nEnter 4 to Exit\n");
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
        display_from_end();
        break;

        case 4:
        continue;

        default:
        printf("Enter Correct Choice\n");
            break;
        }
    } while (choice!=4);

    return 0;
}