#include <stdio.h>
#include <stdlib.h>

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
	return 0;
}
