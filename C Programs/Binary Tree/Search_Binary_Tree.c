#include<stdio.h>
#include<malloc.h>
#include<math.h>

struct node
{
    int data;
    struct node *left,*right;    
};

struct node *root,*nw;
struct node *newnode(int);
void insert(int);

int main()
{
    root->data=-1;
    root->left=-1;
    root->right=-1;

    insert(rand()*100);
    insert(rand()*100);
}

void insert(int a)
{
    if(root->data==-1)
    root->data=a;
    else
    {
        if(root->data>a)
        root->left->data=a;
        else
        root->right->data=a;    
    }
}

void inorder(struct node *root)
{
    if(root!=NULL)
    {
        inorder(root->left);
        printf("%i\t",root->data);
        inorder(root->right);
    }
}