#include <stdio.h>

void swap(int[],int,int);

int main()
{
    int arr[5]={1,5,3,2,4};
    
    int l=sizeof(arr)/sizeof(arr[0]);

    for(int last_index=l-1;last_index>0;last_index--)
    {
        for(int i=0;i<last_index;i++)
        {
            if(arr[i]>arr[i+1])
            swap(arr,i,i+1);
        }
    }

    for(int i=0;i<l;i++)
    printf("%i\n",arr[i]);

    return 0;
}

void swap(int arr[],int i, int j)
{
    if(i==j)
    return;

    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
}