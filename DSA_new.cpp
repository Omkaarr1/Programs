#include <iostream>
#include<string>
using namespace std;

int main()
{
    int M,N,mkdir1=0,mkdir2=0;
    char ch='\\';
    size_t found;

    cout<<"Enter Value of N -->\n";
    cin>>N;

    cout<<"Enter Value of M -->\n";
    cin>>M;

    string  APDir[N];
    string NDir[M];
    int MkDir1[M];
    
    if(N!=0)
    for (int i = 0; i < N; i++)
    cin>>APDir[i];

    if(M!=0)
    for (int i = 0; i < M; i++)
    cin>>NDir[i];

    found=-1;

    for(int i=0;i<M;i++)
    {
        for(found=0,mkdir1=0;found!=NDir[i].find_last_of(ch);found = NDir[i].find(ch,found+1),mkdir1++);
        mkdir1++;
        MkDir1[i]=mkdir1;
    }

    cout<<MkDir1[0];


    return 0;
}