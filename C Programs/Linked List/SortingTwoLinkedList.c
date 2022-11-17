#include<stdio.h>
#include<malloc.h>

struct node
{
    int data;
    struct node *next;
};

struct node *head1,*head2,*tail1,*tail2,*head3;

void add1(struct node *);
void add2(struct node *);
void print(struct node *);
void sort();

int main()
{
    int n1,n2;
    struct node *data1 = (struct node *)malloc(sizeof(struct node *));
    
    data1->data = -1;
    data1->next = NULL;
    head1 = data1;
    tail1=data1;

    struct node *data2 = (struct node *)malloc(sizeof(struct node *));
    
    data2->data = -1;
    data2->next = NULL;
    head2 = data2;
    tail2=data2;

    printf("Enter Elements in List 1 -->\n");
    scanf("%i",&n1);

    printf("Enter Elements in List 2 -->\n");
    scanf("%i",&n2);

    printf("Enter Elements of List 1 -->\n");
    for(int i = 0;i<n1;i++,add1(data1));

    
    printf("Enter Elements of List 2 -->\n");
    for(int i = 0;i<n1;i++,add2(data2));

    tail1->next = head2;

    printf("Before Sorting\n");
    print(head1);
    printf("\n");

    sort();
}

void add1(struct node *data)
{
    int item;

    printf("Enter the Item -->\n");
    scanf("%i",&item);

    if(data->data == -1)
    {
        data->data = item;
        return;
    }

    struct node *new = (struct node *)malloc(sizeof(struct node *));

    new -> data = item;
    new ->next = NULL;
    tail1 ->next = new;
    tail1 = new;
}

void add2(struct node *data)
{
    int item;

    printf("Enter the Item -->\n");
    scanf("%i",&item);

    if(data->data == -1)
    {
        data->data = item;
        return;
    }

    struct node *new = (struct node *)malloc(sizeof(struct node *));

    new -> data = item;
    new ->next = NULL;
    tail2 ->next = new;
    tail2 = new;
}

void print(struct node *head)
{
    for(struct node *temp = head ; temp!=NULL ;temp = temp->next)
    printf("%i ",temp->data);
}

void sort()
{
    struct node *temp = head1,*temp2;

    for(;temp!=NULL;temp=temp->next)
    {
        temp2 = head1;
        for(;temp2!=NULL;temp2=temp2->next)
        {
            if(temp->data<temp2->data)
            {
                int tempp = temp->data;
                temp->data = temp2->data;
                temp2->data = tempp;
            }
        }
    }

    printf("After Sorting");
    print(head1);
}