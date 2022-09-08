#include<stdio.h>
#include<malloc.h>

struct node 
{
    int data;
    struct node *next,*previous;
};

struct node *head,*tail,*nw,*temp;

void creation();
void display();
void display_from_end();

void creation()
{
    temp=head;
    int item;

    printf("Enter the Item -->\n");
    scanf("%i",&item);

    if(temp->data==-1)
    temp->data=item;
    else
    {
        nw=(struct node *)malloc(sizeof(struct node));
        nw->data=item;
        nw->next=NULL;
        nw->previous=tail;
        tail->next=nw;
        tail=nw;
    }
}

void display()
{
    temp=head;

    if(temp->data == -1)
    printf("List is Empty\n");
    else
    {
        for(;temp!=NULL;temp=temp->next)
        printf("%i ",temp->data);
        printf("\n");
    }
}

void display_from_end()
{
    temp=tail;

    for(;temp->previous!=NULL;temp=temp->previous)
    printf("%i ",temp->data);

    printf("%i\n",temp->data);


}

int main()
{
    int c;
    nw=(struct node *)malloc(sizeof(struct node));
    head=nw;
    tail=nw;
    nw->data=-1;
    nw->next=NULL;
    nw->previous=NULL;
    int choice = 0;
    
    printf("Enter the Number of Nodes -->");
    scanf("%i",&c);

    for(int i=0;i<c;i++)
    creation();

    printf("Displaying From First Node to Last Node -->\n");
    display();

    printf("Displaying From Last Node to First Node -->\n");
    display_from_end();
}