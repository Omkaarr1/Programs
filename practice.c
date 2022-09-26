#include<stdio.h>
void printArray(int *A ,int n){
	int i;
	for(i=0; i<n;i++){
		printf(" %d ",A[i]);
	}
	printf("\n");	
}

void bubbleSort(int *A,int n){
	int temp;
	int i;
	int j;
	for(i=0;i<n-1;i++){
		for(j=0;j<n-1-i;j++){
			if(A[j]>A[j+1]){
				temp=A[j];
				A[j]=A[j+1];
				A[j+1]=temp;
			}
			
		}
	}
}

int main()
{
	int n,i;
	printf("Enter the size of ARRAY\n");
	scanf("%i",&n);

	int A[n];

	printf("Enter the element of array\n");
	for(i=0;i<n;i++)
	scanf("%i",&A[i]);

	printArray(A,n);
	bubbleSort(A,n);
	printArray(A,n);
	
	return 0;
}