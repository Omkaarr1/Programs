#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int values[];

void ini()
{
    values[1000];

    for(int i=0;i<1000;i++)
    values[i] = rand();
}

int cmpfunc (const void * a, const void * b) {
   return ( *(int*)a - *(int*)b );
}

int main () 
{
    ini();
   int n;
   
   int start = clock();
   
   printf("Before sorting the list is: \n");
   for( n = 0 ; n < 1000; n++ ) {
      printf("%d ", values[n]);
   }

   qsort(values, 1000, sizeof(int), cmpfunc);

   printf("\nAfter sorting the list is: \n");
   for( n = 0 ; n < 1000; n++ ) {   
      printf("%d ", values[n]);
   }
   
   int stop = clock();
   
   printf("\n%f",(stop-start));
  
   return(0);
}