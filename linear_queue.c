#include <stdio.h>

struct queue
{
    int a[5];
    int front,rear;
}lq;

void main()
{
    int choice,iteam,temp;
    lq.front=lq.rear=-1;

    do
    {
        printf("\n1. insertion\n2. Deletion\n3. Display\n4. Exit\n");
        scanf("%i",&choice);

        switch (choice)
        {
        case 1:
        
        if(lq.rear==4)
        printf("Queue is Full!!\n");
        else
        {
            printf("Enter the iteam\n");
            scanf("%i",&iteam);

            if(lq.rear==-1)
            {
                lq.front++;
                lq.rear++;
                lq.a[lq.rear]=iteam;
            }
            else
            lq.a[lq.rear++]=iteam;
        }
        break;
        
        case 2:

        if(lq.rear==-1)
        printf("Queue Empty!!\n");
        else
        {
            if((lq.rear == lq.front) && (lq.rear!=-1))
            lq.front=lq.rear=-1;
            else
            lq.front++;
        }
        break;
        
        case 3:

        if(lq.rear==-1)
        printf("Queue Empty!!\nNothing to Display!\n");
        else
        {
            temp=lq.front-1;
            for(;temp<lq.rear;temp++)
            printf("%i\n",lq.a[temp]);
        }
        break;
        }
   }while(choice!=4); 
}