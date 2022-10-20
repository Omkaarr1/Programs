#include <stdio.h>
#include <stdlib.h>


struct node* newNdoe(int);
void inorder(struct node *);
struct node* insert(struct node*,int);
struct node* minValueNode(struct node *);
struct node* maxValueNode(struct node *);
struct node* deleteNode(struct node *,int);
void searching(struct node *);
struct node * cloneBinaryTree(struct node *);

struct node {
	int data;
	struct node *left, *right;
};

struct node* newNode(int item)
{
	struct node* temp = (struct node*)malloc(sizeof(struct node));
	temp->data = item;
	temp->left = temp->right = NULL;
	return temp;
}

void inorder(struct node* root)
{
	if (root != NULL) {
		inorder(root->left);
		printf("%d ", root->data);
		inorder(root->right);
	}
}

struct node* insert(struct node* node, int data)
{
	if (node == NULL)
	return newNode(data);

	if (data < node->data)
	node->left = insert(node->left, data);
	else
	node->right = insert(node->right, data);

	return node;
}

struct node* minValueNode(struct node* node)
{
	struct node* current = node;

	while (current && current->left != NULL)
	current = current->left;

	return current;
}

struct node* maxValueNode(struct node* node)
{
	struct node* current = node;

	while (current && current->right != NULL)
	current = current->right;

	return current;
}

struct node* deleteNode(struct node* root, int data)
{
	if (root == NULL)
		return root;
	if (data < root->data)
		root->left = deleteNode(root->left, data);
	else if (data > root->data)
		root->right = deleteNode(root->right, data);
	else {
		if (root->left == NULL) {
			struct node* temp = root->right;
			free(root);
			return temp;
		}
		else if (root->right == NULL) {
			struct node* temp = root->left;
			free(root);
			return temp;
		}
		struct node* temp = minValueNode(root->right);
		root->data = temp->data;
		root->right = deleteNode(root->right, temp->data);
	}
	return root;
}

void searching(struct node *root)
{
    int item;
    printf("Enter item to be Searched -->\n");
    scanf("%i",&item);

    for(;root->left!=NULL && root->right != NULL;)
    {
        if(item == root->data)
        {
            printf("Element found in the Tree!!\n");
            return;
        }
        if(root->data>item)
        root=root->left;
        else if(root->data<item)
        root=root->right;
    }

    if(root->data>item)
    root=root->left;
    else if(root->data<item)
    root=root->right;

    if(item == root->data)
    {
        printf("Element found in the Tree!!\n");
        return;
    }

    printf("Element Not found in the Tree!!\n");
}

struct node* cloneBinaryTree(struct node *root){
    if(root == NULL)
        return NULL;

    struct node* NewNode = newNode(root->data);

    NewNode->left = cloneBinaryTree(root->left);
    NewNode->right = cloneBinaryTree(root->right);

    return NewNode;
}

int main()
{
	/* Let us create following BST
			50
		  /	   \
		30      70
	    / \    /  \
	   20 40  60  80 */
	struct node* root = NULL;
	root = insert(root, 50);
	root = insert(root, 30);
	root = insert(root, 20);
	root = insert(root, 40);
	root = insert(root, 70);
	root = insert(root, 60);
	root = insert(root, 80);

	printf("Inorder traversal of the given tree \n");
	inorder(root);

    printf("\n\n");

    printf("Minimum Value --> %i\n",minValueNode(root)->data);
    printf("Maximum Value --> %i\n",maxValueNode(root)->data);

	printf("\nDelete 20\n");
	root = deleteNode(root, 20);
	printf("Inorder traversal of the modified tree \n");
	inorder(root);

	printf("\nDelete 30\n");
	root = deleteNode(root, 30);
	printf("Inorder traversal of the modified tree \n");
	inorder(root);

	printf("\nDelete 50\n");
	root = deleteNode(root, 50);
	printf("Inorder traversal of the modified tree \n");
	inorder(root);
    
    printf("\n\n");

    searching(root);

	printf("\n\n");

    printf("Copy of the Tree (Inorder Traversal)-->\n");
	inorder(cloneBinaryTree(root));

	return 0;
}
