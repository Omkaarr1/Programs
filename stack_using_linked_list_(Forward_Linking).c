#include <stdio.h>
#include <malloc.h>

struct node
{
    int data;
    struct node *next;
};

struct node *head,*tail,*temp;
struct node *nw;

void push()
{
    int item;
    
    printf("Enter Item to Push -->\n");
    scanf("%i",&item);

    if(nw->data == 0)
    {
        nw->data=item;
        nw->next=NULL;
        tail=nw;
        return;
    }
    
    temp = nw;

    nw=(struct node*) malloc(sizeof(struct node));
    
    nw->data=item;
    temp->next=nw;
    nw->next=NULL;
    tail=nw;

    printf("Pushed\n");
}

void pop()
{

    int x,n=0,i=0;
    temp=head;
    
    if(temp->next==NULL)
    {
        if(temp->data==-1)
        {
            printf("Stack Empty!!\n");
            return;
        }
        else
        {
           printf("Poped Element -->%i\n",temp->data);
           temp->data=-1;
           return;
        }
    }
    
    for(temp=head;temp!=tail;temp=temp->next)
    n++;

    printf("%i\n",n);
    printf("Poped Element -->%i\n",temp->data);

    free(temp);

    temp = head;

    for(int i=0;i<n-1;temp=temp->next,i++);

    temp->next=NULL;
    tail=temp;
}

void display()
{
    temp=head;
    for(;temp!=NULL;temp=temp->next)
    printf("%i ",temp->data);
    printf("\n");
}

int main()
{
    int choice;

    
    nw=(struct node*) malloc(sizeof(struct node));
    
    nw->data=0;
    nw->next=NULL;

    head=nw;
    tail=nw;

    do
    {
        printf("Enter 1 to Push\n");
        printf("Enter 2 to Pop\n");
        printf("Enter 3 to Display\n");
        printf("Enter 4 to Exit\n");
        scanf("%i",&choice);

        switch (choice)
        {
        case 1:
        push();
        break;

        case 2:
        pop();
        break;
        
        case 3:
        display();
        break;
        }
    } while (choice != 4);
    
}