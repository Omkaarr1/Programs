#include <stdio.h>

int main()
{
    int a[10],i,pos,n,element,choice,l1,l2;

    do
    {
        printf("1. Creation\n");
        printf("2. Insertion\n");
        printf("3. Delition\n");
        printf("4. Display\n");
        printf("5. Creation of Two arrays and Mergin it in One Sorted Array\n");
        printf("6. Exit\n");
        scanf("%i",&choice);
        
        switch (choice)
        {
            case 1:
            printf("Enter Length of Array!\n");
            scanf("%i",&n);
            
            printf("Enter Elements of the Array!!\n");
            
            for(i=0;i<n;i++)
            scanf("%i",&a[i]);
            break;

            case 2:
             printf("Before Insertion!!\n");
             
             for(i=0;i<n;i++)
             printf("%i ",a[i]);
             
             printf("\n");
             
             printf("Enter the position!\n");
             scanf("%i",&pos);
             
             pos--;

             printf("Enter the New Element!!\n");
             scanf("%i",&element);
             
             for(i=n;i>pos;i--)
             a[i]=a[i-1];
             n++;
             a[i]=element;
             
             printf("\n");
             
             printf("After Insertion!!\n");
             
             printf("\n");
             
             for(int i=0;i<n;i++)
             printf("%i ",a[i]);
             printf("\n");

             break;

            case 3:
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
            printf("\n");

            n--;
            break;
            
            case 4:

            for(int i=0;i<n;i++)
            printf("%i ",a[i]);
            printf("\n");
            break;
            
            case 5:

            printf("Enter Limit of Array 1 -->\n");
            scanf("%i",&l1);
            
            printf("Enter Limit of Array 2 -->\n");
            scanf("%i",&l2);

            int a[l1],b[l2];
            
            printf("Enter Elements of First Array!!\n");
            for(int i=0;i<l1;i++)
            scanf("%i",&a[i]);

            printf("Enter Elements of Second Array!!\n");
            for(int i=0;i<l2;i++)
            scanf("%i",&b[i]);

            for(int i=0;i<l1;i++)
            for(int j=0;j<l1;j++)
                if(a[i]<a[j])
                    {
                        int temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }

            for(int i=0;i<l1;i++)
            for(int j=0;j<l1;j++)
                if(b[i]<b[j])
                    {
                        int temp=b[i];
                        b[i]=b[j];
                        b[j]=temp;
                    }
            
            int c[l1+l2];

            int i=0,j=0,k=0;

            while(i<l1 && j<l2)
            if(a[i]<b[j])
            c[k++]=a[i++];
            else
            c[k++]=b[j++];

            while (i<l1)
            c[k++]=a[i++];

            while (j<l2)
            c[k++]=b[j++];
            

            for(int i=0;i<l1+l2;i++)
            printf("%i ",c[i]);
            printf("\n");
            break;
        }
    } while (choice!=6);
    

    return 0;
}
