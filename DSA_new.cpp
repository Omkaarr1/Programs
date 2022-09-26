#include <iostream>
#include<string>
using namespace std;

int main()
{
    int M,N,mkdir1=0,mkdir2=0,i1,i2;
    char ch='/';
    size_t found;
    string root="",replace="";

    cout<<"Enter Value of N -->\n";
    cin>>N;

    cout<<"Enter Value of M -->\n";
    cin>>M;

    string  APDir[N];
    string NDir[M];
    string NDir2[M];
    int MkDir1[M];
    
    if(N!=0)
    for (int i = 0; i < N; i++)
    cin>>APDir[i];

    if(M!=0)
    for (int i = 0; i < M; i++)
    cin>>NDir[i];
    
    NDir2[0]=NDir[0];

    for(int i=0,j=0;i<M-1;i++)
    {

    }
   return 0;
}