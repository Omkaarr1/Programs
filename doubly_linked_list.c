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
void insertion();

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

void insertion()
{
    int n=0,item,pos;
    temp=head;
    nw=(struct node *)malloc(sizeof(struct node));

    printf("Enter the Item\n");
    scanf("%i",&item);

    printf("Enter the Position\n");
    scanf("%i",&pos);

    nw->data=item;

    for(;temp->next!=NULL;temp=temp->next)
    n++;

    if(!(pos<=n))
    {
        printf("Invalid Insertion!!\n");
        return;
    }
    else if(pos == 0)
    {
        nw->next=NULL;
        tail->next=nw;
        nw->previous=tail;
        tail=nw;
    }
    else
    {
        temp=head;

        for(int i=0;i<pos-1;i++)
        temp=temp->next;

        nw->previous=temp;
        nw->next=temp->next;
        temp->next=nw;
        temp=nw->next;
        temp->previous=nw;
    }
}

void insertion_at_middle()
{
    int n=0,item,pos;
    temp=head;
    nw=(struct node *)malloc(sizeof(struct node));

    printf("Enter the Item\n");
    scanf("%i",&item);

    nw->data=item;

    for(;temp->next!=NULL;temp=temp->next)
    n++;

    temp=head;

    for(int i=0;i<n/2;i++)
    temp=temp->next;
    
    nw->previous=temp;
    nw->next=temp->next;
    temp->next=nw;
    temp=nw->next;
    temp->previous=nw;   
}

int main()
{
    nw=(struct node *)malloc(sizeof(struct node));
    head=nw;
    tail=nw;
    nw->data=-1;
    nw->next=NULL;
    nw->previous=NULL;
    int choice = 0;

    do
    {
        printf("Enter 1 to Add\nEnter 2 to Display\nEnter 3 to Display Reverse\nEnter 4 to Insertion\nEnter 5 to Perform Insertion at Middle\nEnter 6 to Exit\n");
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
        insertion();
        break;

        case 5:
        insertion_at_middle();
        break;

        default:
        printf("Enter correct Choice!!\n");
        break;
        }
    } while (choice!=6);
}