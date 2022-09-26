#include <iostream>
#include<string>
using namespace std;

int main()
{
    int M,N,mkdir1=0,mkdir2=0;
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
        root=NDir[i];
        for(replace=NDir[i+1],j=0;j<replace.length();j++)
        {
            if(root[j]!=replace[j])
            {
                if(i%2!=0)
                replace=replace.substr(j);
                else
                replace=replace.substr(j-1);
                break;
            }
        }
        NDir2[i+1]=replace;
    }

    cout<<endl<<endl;
   

    found=-1;

    for(int i=0;i<M;i++)
    {
        for(found=0,mkdir1=0;found!=NDir2[i].find_last_of(ch);found = NDir2[i].find(ch,found+1),mkdir1++);
        mkdir1++;
        MkDir1[i]=mkdir1;
    }

    for (int i = 0; i < M; i++)
    cout<<MkDir1[i]<<endl;
    

    return 0;
}