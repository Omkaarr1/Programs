#include <stdio.h>

void display(int[],int);

int main()
{
    int n;
    
    printf("Enter Elements in the Array -->\n");
    scanf("%i",&n);

    int A[n];

    printf("Enter the Elements of the Array -->\n");
    
    for(int i=0;i<n;i++)
    scanf("%i",&A[i]);

    for(int i=0;i<n-1;i++)
    for(int j=0;j<n-i-1;j++)
    {
        if(A[j]>A[j+1])
        {
            int temp=A[j];
            A[j]=A[j+1];
            A[j+1]=temp;
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