#include <iostream>
#include<string>
using namespace std;

string removeWord(string,string);

int main()
{
    int M,N,mkdir1=0,mkdir2=0;
    string a="",b="";

    cout<<"Enter Value of N -->\n";
    cin>>N;

    cout<<"Enter Value of M -->\n";
    cin>>M;

    string  APDir[N];
    string NDir[M];
    string NDir2[M];
    int MkDir1[M],l;
    
    if(N!=0)
    for (int i = 0; i < N; i++)
    cin>>APDir[i];

    if(M!=0)
    for (int i = 0; i < M; i++)
    cin>>NDir[i];

    for(int i=0;i<N;i++)
    {
        a=APDir[i];

        for(int j=0;j<M;j++)
        {
            b=removeWord(NDir[j],a);
            if(b[0]!='/')
            NDir[j]="/"+b;
            else
            NDir[j]=b;
        }
    }

    

    for(int i=0;i<M;i++)
    cout<<NDir[i]<<endl;


   return 0;
}

string removeWord(string str, string word) 
{
    // Check if the word is present in string
    // If found, remove it using removeAll()
    if (str.find(word) != string::npos)
    {
        size_t p = -1;
  
        // To cover the case
        // if the word is at the
        // beginning of the string
        // or anywhere in the middle
        string tempWord = word + " ";
        while ((p = str.find(word)) != string::npos)
            str.replace(p, tempWord.length(), "");
  
        // To cover the edge case
        // if the word is at the
        // end of the string
        tempWord = " " + word;
        while ((p = str.find(word)) != string::npos)
            str.replace(p, tempWord.length(), "");
    }
  
    // Return the resultant string
    return str;
}