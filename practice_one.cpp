#include <iostream>
#include<string>
using namespace std;

int main()
{
    string a,b;
    int temp;

    cin>>a>>b;

    for(int i=0;i<b.length();i++)
    {
        if(a[i]!=b[i])
        {
            b=b.substr(i-1);
            break;
        }
    }

    cout<<a<<endl<<b;

    return 0;
}