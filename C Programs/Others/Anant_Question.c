/*Assume the following sequence of input
7,7,5,2,5,2,8,5,6,8,8,7,4,4,7,2,3,8,9,3,2,9,7,8,3
Count the number of occurrence of each digit (as per 
increasing order of given digit) and store those numbers 
in a new array. The result of this process looks like 
4,3,2,3,1,5,5,2
Means digit 2 occurs 4 times, digit 3 occurs 3 times, digit 
4 occurs 2 times, digit 5 occurs 3 times, digit 6 occurs 1 
time, digit 7 occurs 5 times, digit 8 occurs 5 times, and 
digit 9 occurs 2 times.
Assume this intermediate output sequence as an
input for merge sort and perform merge sort to get 
sorted order in both ascending and descending order.*/

#include<stdio.h>

void printArray(int[],int);
int frequency(int[],int);
int n;

int main()
{
    int i=0,j=0,temp=0,ucount=0;

    printf("Enter the Number of Elements -->\n");
    scanf("%i",&n);

    int a[n];

    printf("Enter the Elements -->\n");

    for(;i<n;i++)
    scanf("%i",&a[i]);

    for(i=0;i<n;i++)
    for(j=0;j<n;j++)
    if(a[i]<a[j])
    {
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    printf("\n");

    ucount=1;

    for(int i=0;i<n-1;i++)
    if(a[i]!=a[i+1])
    ucount++;
    
    int b[ucount];

    printArray(a,n);
    printf("\n");

    for(int i=0,c=0;i<n;i++)
    {
        if(a[i]!=a[i+1])
        {
            b[c]=frequency(a,a[i]);
            c++;
        }
    }
    
    printArray(b,ucount);

    return 0;
}

void printArray(int a[],int n)
{
    int i;
    for(i=0;i<n;i++)
    printf("%i ",a[i]);
}

int frequency(int a[],int x)
{
    int count = 0;
    for (int i=0; i < n; i++)
       if (a[i] == x)
          count++;
    return count;
}