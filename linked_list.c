/*
*   W.A.P. to Create To Linked List and Perform the Following operations -->
*   1 - Merging
*   2 - Insertion
*   3 - Make Empty
*   4 - Is Empty
*   5 - Searching
*   6 - Display list 1
*   7 - Display list 2
*   8 - Recreation of List
*/

#include <stdio.h>
#include <malloc.h>

struct node
{
    int data;
    struct node *next;
};

struct node *head1,*tail1,*temp1,*head2,*tail2,*temp2,*headm,*temp,*nw1,*nw2;
int call=0;

void creation1(int);
void display1(int);
void creation2(int);
void display2(int);
void merging(int,int);
void displayMerging();
void insertionInList1();
void insertionInList2();
void emptyList1(int);
void emptyList2(int);
void isEmptyList1();
void isEmptyList2();
void searchList1(int);
void searchList2(int);


void creation1(int n)
{
    int item;
    nw1=(struct node*) malloc(sizeof(struct node));

    nw1->data=0;
    nw1->next=NULL;

    head1=nw1;
    tail1=nw1;

    for(int i=0;i<n;i++)
    {
        printf("Enter the Item -->\n");
        scanf("%i",&item);

        if(nw1->data==0)
        nw1->data=item;
        else
        {
            nw1=(struct node*) malloc(sizeof(struct node));
            nw1->data=item;
            nw1->next=NULL;
            tail1->next=nw1;
            tail1=nw1;
        }
    }
}

void creation2(int n)
{
    int item;
    nw2=(struct node*) malloc(sizeof(struct node));

    nw2->data=0;
    nw2->next=NULL;

    head2=nw2;
    tail2=nw2;

    for(int i=0;i<n;i++)
    {
        printf("Enter the Item -->\n");
        scanf("%i",&item);

        if(nw2->data==0)
        nw2->data=item;
        else
        {
            nw2=(struct node*) malloc(sizeof(struct node));
            nw2->data=item;
            nw2->next=NULL;
            tail2->next=nw2;
            tail2=nw2;
        }
    }
}

void display1(int n)
{
    temp1=head1;

    if(temp1->data==-1)
    {
        printf("List is Empty!!\n");
        return;
    }

    for(int i=0;i<n;i++)
    {
        if(i!=n-1)
        printf("%i --> ",temp1->data);
        else
        printf("%i",temp1->data);
        
        temp1=temp1->next;
    }
    printf("\n");
}

void display2(int n)
{
    temp2=head2;
    
    if(temp2->data==-1)
    {
        printf("List is Empty!!\n");
        return;
    }
    
    for(int i=0;i<n;i++)
    {
        if(i!=n-1)
        printf("%i --> ",temp2->data);
        else
        printf("%i",temp2->data);
        
        temp2=temp2->next;
    }
    printf("\n");
}

void merging(int m,int n)
{
    if(head1->data==-1 && head2->data==-1)
    {
        printf("Both List are Empty (Nothing to Merge)!!\n");
        return;
    }

    int choice,item;
    struct node *mn=(struct node*) malloc(sizeof(struct node)),*continunation;

    mn->data=0;
    mn->next=NULL;

    printf("Enter 1 to merge List 1 to List 2\n");
    printf("Enter 2 to merge List 2 to List 1\n");
    scanf("%i",&choice);

    temp=mn;
    headm=mn;

    switch (choice)
    {
    case 1:
    continunation=head1;
    
    if(head1->next!=NULL)
    for(int i=0;i<n;i++)
    {
        item=continunation->data;
        continunation=continunation->next;
        if(mn->data==0)
        mn->data=item;
        else
        {
            mn=(struct node*) malloc(sizeof(struct node));
            mn->data=item;
            mn->next=NULL;
            temp->next=mn;
            temp=mn;
        }
        if(continunation == NULL)
        break;
    }

    continunation=head2;
    
    if(head2->next!=NULL)
    for(int i=0;i<m;i++)
    {
        item=continunation->data;
        continunation=continunation->next;
        if(mn->data==0)
        mn->data=item;
        else
        {
            mn=(struct node*) malloc(sizeof(struct node));
            mn->data=item;
            mn->next=NULL;
            temp->next=mn;
            temp=mn;
        }
        if(continunation == NULL)
        break;
    }

    displayMerging();
    break;

    case 2:
    continunation=head2;
    
    if(head2->next!=NULL)
    for(int i=0;i<m;i++)
    {
        item=continunation->data;
        continunation=continunation->next;
        if(mn->data==0)
        mn->data=item;
        else
        {
            mn=(struct node*) malloc(sizeof(struct node));
            mn->data=item;
            mn->next=NULL;
            temp->next=mn;
            temp=mn;
        }
        if(continunation == NULL)
        break;
    }

    continunation=head1;
    
    if(head1->next!=NULL) 
    for(int i=0;i<n;i++)
    {
        item=continunation->data;
        continunation=continunation->next;
        if(mn->data==0)
        mn->data=item;
        else
        {
            mn=(struct node*) malloc(sizeof(struct node));
            mn->data=item;
            mn->next=NULL;
            temp->next=mn;
            temp=mn;
        }
        if(continunation == NULL)
        break;
    }

    displayMerging();
    break;
  }
}

void displayMerging()
{
    temp=headm;

    for(;temp!=NULL;temp=temp->next)
    printf("%i ",temp->data);
    
    printf("\n");
}

void insertionInList1()
{
    if(head1->data==-1)
    {
        printf("List is Empty!!\n");
        return;
    }

    nw1=(struct node*) malloc(sizeof(struct node));
    int item,position;

    printf("Enter the Item to be added!\n");
    scanf("%i",&item);

    printf("Enter the Position!!\n");
    scanf("%i",&position);

    nw1->data=item;
    temp=head1;
    temp1=head1;

    for(int i=0;i<position-1;i++)
    temp=temp->next;

    temp1=temp->next;
    temp->next=nw1;
    nw1->next=temp1;
    
    printf("Insertion Completed!!\n");

}

void insertionInList2()
{
    if(head1->data==-1)
    {
        printf("List is Empty!!\n");
        return;
    }

    int item,position;
    nw2=(struct node*) malloc(sizeof(struct node));

    printf("Enter the Item to be added!\n");
    scanf("%i",&item);

    printf("Enter the Position!!\n");
    scanf("%i",&position);

    nw2->data=item;

    temp->next=head1;
    temp2->next=head1;

    for(int i=0;i<position-1;i++)
    temp=temp->next;

    temp2=temp->next;
    temp->next=nw2;
    nw2->next=temp1;
    
    printf("Insertion Completed!!\n");
}

void emptyList1(int n)
{
    temp=tail1;
    temp1=head1;

    for(int j=2;temp!=head1;j++)
    {
        for(int i=0;i<n-j;i++)
        temp1=temp1->next;
        free(temp);
        temp=temp1;
        temp1=head1;
    }

    temp->data=-1;
    temp->next=NULL;

    printf("List is Empty Now!!\n");
}

void emptyList2(int m)
{
    
    temp=tail2;
    temp2=head2;

    for(int j=2;temp!=head2;j++)
    {
        for(int i=0;i<m-j;i++)
        temp2=temp2->next;
        free(temp);
        temp=temp2;
        temp2=head2;
    }

    temp->data=-1;
    temp->next=NULL;

    printf("List is Empty Now!!\n");
}

void isEmptyList1()
{
    temp=head1;

    if(temp->data==-1 && temp->next==NULL)
    printf("List is Empty!!\n");
    else
    printf("List is Not Empty!!\n");

}

void isEmptyList2()
{
    temp=head2;

    if(temp->data==-1 && temp->next==NULL)
    printf("List is Empty!!\n");
    else
    printf("List is Not Empty!!\n");
    temp=head1;
}

void searchList1(int n)
{
    temp=head1;
    int item;


    if(temp->data==-1)
    {
        printf("List is Empty!!\n");
        return;
    }

    printf("Enter Item to Search!!\n");
    scanf("%i",&item);

    for(int i=0;i<n;i++)
    {
        if(temp->data == item)
        {
            printf("Item Found in the List\n");
            return;
        } 
        temp=temp->next;
    }
    
    printf("Item Not Found in the List!!\n");
}

void searchList2(int n)
{
    temp=head2;
    int item;

    if(temp->data==-1)
    {
        printf("List is Empty!!\n");
        return;
    }

    printf("Enter Item to Search!!\n");
    scanf("%i",&item);

    for(int i=0;i<n;i++)
    {
        if(temp->data == item)
        {
            printf("Item Found in the List\n");
            return;
        } 
        temp=temp->next;
    }
    printf("Item Not Found in the List!!\n");
}

int main()
{
    int n,m,choice,c;

    printf("Enter the Value of N -->\n");
    scanf("%i",&n);

    creation1(n);
    
    printf("Enter the Value of M -->\n");
    scanf("%i",&m);

    creation2(m);

    do
    {
        printf("1 - Merging\n");
        printf("2 - Insertion\n");
        printf("3 - Make Empty\n");
        printf("4 - Is Empty\n");
        printf("5 - Searching\n");
        printf("6 - Display List 1\n");
        printf("7 - Display List 2\n");
        printf("8 - Recrration of List!\n");
        printf("9 - Exit\n");
        scanf("%i",&choice);

        switch (choice)
        {
        case 1:
        merging(m,n);
        break;

        case 2:
        printf("Enter 1 to Perform Instertion on List 1\nEnter 2 to Perform Instertion on List 2\n");
        scanf("%i",&c);

        if(c==1)
        {
            insertionInList1();
            n++;
        }
        else if(c==2)
        {
            insertionInList2();
            m++;
        }
        else
        printf("Enter Correct Choice!\n");
        break;

        case 3:
        printf("Enter 1 to make List 1 Empty\nEnter 2 to make List 2 Empty\n");
        scanf("%i",&c);

        if(c==1)
        emptyList1(n);
        else if(c==2)
        emptyList2(m);
        else
        printf("Enter Correct Choice!\n");
        break;

        case 4:
        printf("Enter 1 to check if List 1 Empty\nEnter 2 to check if List 2 Empty\n");
        scanf("%i",&c);

        if(c==1)
        isEmptyList1();
        else if(c==2)
        isEmptyList2();
        else
        printf("Enter Correct Choice!\n");
        break;

        case 5:
        printf("Enter 1 to search in List 1 Empty\nEnter 2 to search in List 2 Empty\n");
        scanf("%i",&c);

        if(c==1)
        searchList1(n);
        else if(c==2)
        searchList2(m);
        else
        printf("Enter Correct Choice!\n");
        break;

        case 6:
        display1(n);
        break;

        case 7:
        display2(m);
        break;

        case 8:
        main();
        return 0;
        break;

        case 9:
        printf("Exited Program Successfully!\n");
        continue;
        }
    } while (choice!=9);
}