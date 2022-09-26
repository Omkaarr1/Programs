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

    for(int i=0;i<n;i++)
    for(int j=0;j<i;j++)
    {
        if(A[i]<A[j])
        {
            temp=A[i];
            for(k=i;k>j;A[k]=A[k-1],k--);
            A[k]=temp;
            break;
        }
    }

    display(A,n);

    return 0;
}

void display(int A[],int n)
{
    for(int i=0;i<n;i++)
    printf("%i ",A[i]);
}