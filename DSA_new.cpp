#include <iostream>
using namespace std;

int main()
{
    int M,N;

    cout<<"Enter Value of N -->\n";
    cin>>N;

    cout<<"Enter Value of M -->\n";
    cin>>M;

    string  APDir[N];
    string NDir[M];

    for (int i = 0; i < N; i++)
    cin>>APDir[i];
    
    for (int i = 0; i < M; i++)
    cin>>NDir[i];

    return 0;
}