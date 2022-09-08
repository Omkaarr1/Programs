#include <stdio.h>
#include <malloc.h>

struct node
{
    int data;
    struct node *next;
    struct node *previous;
};

struct node *head,*tail,*temp,*temp1,*temp2;

int main()
{
    struct node *nw;
    int choice,item,count=0,a,b,flag=0;

    head=nw;
    tail=nw;
    nw->data=-1;
    nw->next=NULL;
    nw->previous=NULL;

    do
    {
        printf("Enter 1 to Add Element\nEnter 2 to Search List is Palindrome or Not\nEnter 3 to Eixt\n");
        scanf("%i",&choice);

        if(choice == 1)
        {
            printf("Enter the Item!\n");
            scanf("%i",&item);
        }
        
        switch (choice)
        {
        case 1:

        if(nw->data == -1)
        nw->data=item;
        else
        {
            temp=nw;   // Stores Current Address
            nw=(struct node *)malloc(sizeof(struct node)); //Creates new Address
            nw->data=item;  // Sotres data at new Address
            nw->previous=temp; // Assign Value of Previous pointer of new Address to Temp which is The Atcual Previous Address
            nw->next=NULL;
            temp->next=nw;
            tail=nw;
        }
        break;

        case 2:
        temp1=head;
        temp2=tail;
        

        for(;temp1!=temp2;temp1=temp1->next, temp2=temp2->previous)
        if(temp1->data!=temp2->data)
        {
            printf("NOT PALINDROME!!\n");
            flag=-1;

            break;
        }

        if(flag == -1)
        break;

        printf("PALINDROME\n");

        break;

        }
    }while(choice != 3);
    return 0;
}