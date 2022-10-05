#include <stdio.h>

int main()
{
    int a[10],i,pos,n,element;
    
    printf("Enter Length of Array!\n");
    scanf("%i",&n);

    printf("Enter Elements of the Array!!\n");
    
    for(i=0;i<n;i++)
    scanf("%i",&a[i]);

    printf("Before Deletion!!\n");
    
    for(i=0;i<n;i++)
    printf("%i ",a[i]);

    printf("\n");

    printf("Enter the position!\n");
    scanf("%i",&pos);

    pos--;
    
    for(int i=pos;i<n;i++)
    a[i]=a[i+1];

    a[n]='\0';

    printf("Element Deleted!!\n");

    printf("After Deletion!!\n");
    
    for(i=0;i<n-1;i++)
    printf("%i ",a[i]);

    return 0;
}
