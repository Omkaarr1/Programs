#include <bits/stdc++.h>
#include <iostream> 
using namespace std;

int main()
{
    int num;     // Number of test cases
    cin >> num;
    int count = 1;
    while (num--)
    {
        clock_t time;

        map<string, int> data; 
        int n, m;                   // n - Path of one directory that already exists
                                    // m - Path of one directory that you want ot create
        cin >> n >> m;
        
        time = clock();             // Starting the Clock
        while (n--)
        {

            string s;               // Input of Directory
            cin >> s;
            int l = s.size();
            for (int i = 1; i < l; i++)
            {
                if (s[i] == '/')
                {
                    string temp(s.begin(), s.begin() + i);
                    data[temp] = 1;
                }
            }
            string temp(s.begin(), s.end());
            data[temp] = 1;
        }

        int ans = 0;         //Compare one directory to other
        
        while (m--)
        {
            string s;
            cin >> s;
            int l = s.size();
            int flag = 0;
            for (int i = 1; i < l; i++)
            {
                if (s[i] == '/')
                { 
                    string temp(s.begin(), s.begin() + i);
                    if (flag == 1)
                    {

                        ans++;
                        data[temp] = 1;
                        continue;
                    }
                    if (data[temp] == 1)
                        continue;
                    else
                    {
                        flag = 1;
                        ans++;
                        data[temp] = 1;
                    }
                }
            }
            string temp(s.begin(), s.end());
            if (data[temp] != 1)
            {
                ans++;
                data[temp] = 1;
            }
        }
        
        time = clock() - time; // Stop the time

        cout << "Case #" << count << ": " << ans << endl; // Printing the Number of required nubmer of "mkdir" commands
        count++;

        cout<<"Time Taken : "<< time/CLOCKS_PER_SEC <<" microseconds"<<endl; // Printing the total excution time.
    }
    return 0;
}