#include <stdio.h>

void display(int[],int);

int main()
{
    int n;
    
    printf("Enter Elements in the Array -->\n");
    scanf("%i",&n);

    int A[n],i=0,j=0;
    int Sa1[0],Sa2[0];
    

    n%2==0?Sa1[n/2]:Sa1[(n/2)+1];
    Sa2[n/2];
    printf("%i %i",i,j);

    for(i=0;i<(n/2)+1;i++)
    Sa1[i]=A[i];

    printf("%i %i",i,j);

    
    
    for(j=0;j<(n/2)-1;j++,i++)
    {
        Sa2[j]=A[i];
    }


    printf("Enter the Elements of the Array -->\n");
    
    for(int i=0;i<n;i++)
    scanf("%i",&A[i]);


    
    display(Sa1,(n/2)+1);

    return 0;
}

void display(int A[],int n)
{
    for(int i=0;i<n;i++)
    printf("%i ",A[i]);
}