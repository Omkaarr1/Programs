// Operation on 1d Array
// Name: OMKAR      Reg. Number: 21BIT0530  
// Crested on 28/07/2022

#include <stdio.h>

void main()
{
    int a[10],i,pos,n,element;
    
    printf("Enter Length of Array!\n");
    scanf("%i",&n);

    printf("Enter Elements of the Array!!\n");
    
    for(i=0;i<n;i++)
    scanf("%i",&a[i]);

    printf("Before Insertion!!\n");
    
    for(i=0;i<n;i++)
    printf("%i ",a[i]);

    printf("\n");

    printf("Enter the position!\n");
    scanf("%i",&pos);

    printf("Enter the New Element!!\n");
    scanf("%i",&element);

    for(i=n;i>pos;i--)
    a[i]=a[i-1];
    n++;
    a[i]=element;

    printf("\n");
    
    printf("After Insertion!!");
    
    printf("\n");

    for(int i=0;i<n;i++)
    printf("%i ",a[i]);
    
}