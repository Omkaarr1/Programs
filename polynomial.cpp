#include<iostream>
#include<string>
#include<cstring>

using namespace std;

struct node
{
    int coefficient1;
    int power1;
    int coefficient2;
    int power2;
    struct node *next1;
    struct node *next2;
    
};

struct node *head1,*tail1,*head2,*tail2,*temp,*nw1,*nw2;

void push1(int c,int p)
{
    if(nw1->coefficient1==0 && nw1->power1 == 0 && nw1->next1 == NULL)
    {
        nw1->coefficient1=c;
        nw1->power1=p;
    }
    else
    {
        nw1=(struct node *)malloc(sizeof(struct node));
        nw1->coefficient1=c;
        nw1->power1=p;
        nw1->next1=NULL;
    }
}

void push2(int c,int p)
{
    if(nw2->coefficient1==0 && nw2->power2 == 0 && nw2->next2 == NULL)
    {
        nw2->coefficient2=c;
        nw2->power2=p;
    }
    else
    {
        nw2=(struct node *)malloc(sizeof(struct node));
        nw2->coefficient2=c;
        nw2->power2=p;
        nw2->next2=NULL;
    }
}

void display1()
{
    temp=head1;

    for(;temp!=NULL;temp->next1)
    cout<<temp->coefficient1<<" + "<<temp->power1<<endl;
}

void display2()
{
    temp=head2;

    for(;temp!=NULL;temp->next2)
    cout<<temp->coefficient1<<" + "<<temp->power1<<endl;
}

int main()
{ 
    nw1=(struct node *)malloc(sizeof(struct node)); 
    nw2=(struct node *)malloc(sizeof(struct node));

    nw1->coefficient1=0;
    nw1->next1=0;
    nw1->next1=NULL;
    head1=nw1;
    tail1=nw1;

    nw2->coefficient1=0;
    nw2->next1=0;
    nw2->next1=NULL;
    head2=nw2;
    tail2=nw2;

    string a,b,temp1,temp2;
    int j;

    cout<<"Enter First Polynomial in the Form (Ax^n+Bx^n-1+......+Xx^1-n+Yx^1+Z)"<<endl;
    cin>>a;

    a+="+";

    cout<<"Enter Second Polynomial in the Form (Ax^n+Bx^n-1+......+Xx^1-n+Yx^1+Z)"<<endl;
    cin>>b;

    b+="+";

    for(;;)
    {
        int pos1=a.find("+");
        temp1=a.substr(0,pos1);
        int pos2=temp1.find("x");
        temp2=temp1.substr(0,pos2);
        int c = stoi(temp2);
        temp2=temp1.substr(pos2+2);
        int p = stoi(temp2);
        push1(c,p);
        a=a.substr(pos1);

        int length=a.length();

        if(length==1)
        break;
    }

    for(;;)
    {
        int pos1=b.find("+");
        temp1=b.substr(0,pos1);
        int pos2=temp1.find("x");
        temp2=temp1.substr(0,pos2);
        int c = stoi(temp2);
        temp2=temp1.substr(pos2+2);
        int p = stoi(temp2);
        push1(c,p);
        b=b.substr(pos1);

        int length=b.length();
        
        if(length==1)
        break;
    }

    display1();
    display2();
    return 0;
}
