#include <stdio.h>

void print(int[],int);
void delete(int[],int,int,int);

void print(int arr[],int l)
{
    for (int i = 0; i < l; i++)
    printf("%i\n",arr[i]);
}

void printd(int arr[],int l)
{
    for (int i = 0; i < l-1; i++)
    printf("%i\n",arr[i]);
}

void delete(int arr[],int index,int element,int l)
{
    for(int i=index;i<l-1;i++)
    arr[index]=arr[index+1];
    printd(arr,l);
}

int main()
{
    int element,l,index;

    printf("Enter Length fo Array!!\n");
    scanf("%i",&l);
    
    int arr[l];
    
    printf("Enter Element's of the Array -->\n");
    
    for (int i = 0; i < l; i++)
    scanf("%i",&arr[i]);

    print(arr,l);

    printf("Enter the Element to be Deleted -->\n");
    scanf("%i",&element);
    
    for(int i=0;i<l;i++)
    if(arr[i]==element)
    index=i;

    delete(arr,index,element,l);

}