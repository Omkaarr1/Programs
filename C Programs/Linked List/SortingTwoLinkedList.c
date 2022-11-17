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
void merge(int[],int,int,int);
void mergeSort(int[],int,int);
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

    print(head1);
    printf("\n");
    print(head2);

    tail1->next = head2;
    printf("\n");
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
    struct node *temp = head1;
    int count=0;

    for(;temp!=NULL;temp=temp->next,count++);

    int arr[count];

    temp=head1;

    for(int i=0;temp!=NULL;temp=temp->next,i++)
    arr[i] = temp->data;

    mergeSort(arr,0,count-1);

    for(int i=0;temp!=NULL;temp=temp->next,i++)
    temp->data = arr[i];

    print(head1);
}

void merge(int arr[], int l, int m, int r)
{
	int i, j, k;
	int n1 = m - l + 1;
	int n2 = r - m;

	int L[n1], R[n2];

	for (i = 0; i < n1; i++)
		L[i] = arr[l + i];
	for (j = 0; j < n2; j++)
		R[j] = arr[m + 1 + j];


	i = 0; 
    j = 0; 
    k = l;
    while (i < n1 && j < n2) {
		if (L[i] <= R[j]) {
			arr[k] = L[i];
			i++;
		}
		else {
			arr[k] = R[j];
			j++;
		}
		k++;
	}

	while (i < n1) {
		arr[k] = L[i];
		i++;
		k++;
	}


	while (j < n2) {
		arr[k] = R[j];
		j++;
		k++;
	}
}

void mergeSort(int arr[], int l, int r)
{
	if (l < r) {

		int m = l + (r - l) / 2;

		mergeSort(arr, l, m);
		mergeSort(arr, m + 1, r);
		merge(arr, l, m, r);
	}
}