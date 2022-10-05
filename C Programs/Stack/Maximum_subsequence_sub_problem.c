#include <stdio.h>
#include<stdlib.h>

void create(int*,int);

int main()
{
    int l,sum=0,isum=0,seq=-1;

    printf("Enter the Limit -->\n");
    scanf("%i",&l);

    int a[l];

    printf("Enter Elements -->\n");
    
    for(int i=0;i<l;i++)
    scanf("%i",&a[i]);
    create(a,l);
}

void create(int* a,int l)
{
    int sum=0,isum=0,fsum=0,seq=-1,original_sum=0;

    for(int i=0;i<l;i++)
    original_sum+=a[i];
    
    printf("\nOriginal Sum --> %i\n",original_sum);
    
    for(int i=0,counter=1;i<l;i++)
    {

    isum=a[i];

    for(int j=i;j<l;j++)
    {
        sum+=a[j];
        if(sum>isum)
        {
            isum=sum;
            seq=j+1;
        }
    }
    for(int k=i;k<seq;k++)
    {
        fsum+=a[k];
        printf("%i ",a[k]);
    }
    
    if(fsum>original_sum)
    {
        printf("\n\nSequence %i -->\n",counter++);
        for(int k=i;k<seq;k++)
        printf("%i ",a[k]);
        printf("\nSum --> %i\n",fsum);   
    }
    fsum=0;
    }
}