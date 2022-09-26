#include <stdio.h>

void display(int[],int);

int main()
{
    int n,temp,k;
    
    printf("Enter Elements in the Array -->\n");
    scanf("%i",&n);

    int A[n];

    printf("Enter the Elements of the Array -->\n");
    
    for(int i=0;i<n;i++)
    scanf("%i",&A[i]);

    k=(int)((n/2)-1);

    for(;k>0;k--)
    for(int i=0;i,n;i+=k)
    if(A[i]>A[i+k])
    {
        temp=A[i];
        A[i+k]=A[i];
        A[i]=temp;
    }    

    display(A,n);

    return 0;
}

void display(int A[],int n)
{
    for(int i=0;i<n;i++)
    printf("%i ",A[i]);
}