#include<iostream>
#include<string.h>
using namespace std;

int main()
{
    string x[] = {"H","World"};
    int count=0;

    for(auto i: x)
    count++;

    cout<<x[0]<<endl;
    cout<<x[0][0]<<endl;
    cout<<x[0][1]<<endl;
    cout<<x[1].size()<<endl;
    cout<<count<<endl;

    return 0;
}
