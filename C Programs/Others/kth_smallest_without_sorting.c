#include <stdio.h>

int main()
{
    int l,small,temp=0,iteration=0,k;

    printf("Enter the length of Array!!\n");
    scanf("%i",&l);

    temp=l;
    int a[l];

    printf("Enter the Elemnts of the Array!!\n");
    
    for(int i=0;i<l;i++)
    scanf("%i",&a[i]);

    printf("Enter Value of K\n");
    scanf("%i",&k);

    for(int i=0;i<l;i++)
    {
        small=a[i];
        for(int j=0;j<l;j++)
        {
            if(a[j]<a[i])
            {
                if(temp<=a[j])
                continue;
                small=a[j];
                iteration++;
            }
        }
        temp=small;
        if(iteration==k)
        printf("%i\n",small);
    }


    return 0;
}
