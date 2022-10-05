#include<stdio.h>

int main()
{
    int l1,l2;

    printf("Enter Limti of 1st Array!!");
    scanf("%i",&l1);

    printf("Enter Limti of 2st Array!!");
    scanf("%i",&l2);

    int a[l1],b[l2];

    for(int i=0,j=0;i<l1&& j<l2;i++)
    {
        if(i<l1)
        {
            if(i==0)
            printf("Enter Elements of First Array!!");
            scanf("%i",&a[i]);
        }
        else
        {

        }
    }
    return 0;
}
