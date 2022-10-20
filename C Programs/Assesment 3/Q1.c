#include<stdio.h>
#include<malloc.h>

struct node
{
    int data;
    struct node *left,*right;    
};

struct node *root,*nw;
struct node *newnode(int);
void inorder(struct node *);
void preorder(struct node *);
void postorder(struct node *);
void left_skewed_binary_tree(struct node *);
void right_skewed_binary_tree(struct node *);

int main()
{
    root=newnode(1);
    root->left=newnode(2);
    root->right=newnode(3);
    root->left->left=newnode(4);
    root->left->right=newnode(5);
    root->right->left=newnode(6);
    root->right->right=newnode(7);
    
    printf("Inorder Traversal -->\n");
    inorder(root);
    printf("\nPreorder Traversal -->\n");
    preorder(root);
    printf("\nPostorder Traversal -->\n");
    postorder(root);
    printf("\nLeft Skewed Binary Tree Traversal -->\n");
    left_skewed_binary_tree(root);
    printf("\nRight Skewed Binary Tree Traversal -->\n");
    right_skewed_binary_tree(root);
}

struct node *newnode(int data)
{
    nw=(struct node *)malloc(sizeof(struct node));
    nw->data=data;
    nw->left=NULL;
    nw->right=NULL;
    return nw;
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

void preorder(struct node *root)
{
    if(root!=NULL)
    {
        printf("%i\t",root->data);
        preorder(root->left);
        preorder(root->right);
    }
}

void postorder(struct node *root)
{
    if(root!=NULL)
    {
        postorder(root->left);
        postorder(root->right);
        printf("%i\t",root->data);
    }
}

void left_skewed_binary_tree(struct node *root)
{
    printf("%d\t",root->data);
    if(root->left!=NULL)
    left_skewed_binary_tree(root->left);
}

void right_skewed_binary_tree(struct node *root)
{
    printf("%d\t",root->data);
    if(root->right!=NULL)
    right_skewed_binary_tree(root->right);
}