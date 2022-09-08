#include <iostream>
#include <string>
using namespace std;

int stack[500]; 
int top = -1; 

void push(char ele){
    stack[++top] = ele;
}

int pop(){
    return stack[top--];
}

bool isEmpty(){
    if (top == -1){
        return true;
    }
}

int main(){
    string str;
    cout << "INPUT: ";
    cin >> str;
    
    int count_p = 0;
    int count_c = 0;
    int count_a = 0;

    for (int i=0; i<str.length(); i++){
        if (str[i] == '(') push(str[i]);
        else if (str[i] == ')'){
            if (stack[top] == '('){
                pop(); count_p++;
            }
            else {
                cout << "Parenthesis not balanced" << endl;
            }
        }

        else if (str[i] == '{') push(str[i]);
        else if (str[i] == '}'){
            if (stack[top] == '{'){
                pop(); count_c++;
            }
            else {
                cout << "Curly braces not balanced" << endl;
            }
        }

        else if (str[i] == '<') push(str[i]);
        else if (str[i] == '>'){
            if (stack[top] == '<'){
                pop(); count_a++;
            }
            else {
                cout << "Angular brackets not balanced" << endl;
            }
        }
    }

    cout << "\nParenthesis Status : ";
    cout << count_p << endl;
    if(count_p < 5) cout << "Parenthesis Insufficient " << endl;
    else if(count_p > 5 && count_p < 10) cout << "Parenthesis Moderate " << endl;
    else if(count_p > 10) cout << "Parenthesis Sufficient" << endl;

    cout << "\nCurly Braces Status : ";
    cout << count_c << endl;
    if(count_c < 5) cout << "Curly Braces Insufficient" << endl;
    else if(count_c > 5 && count_c < 10) cout << "Curly Braces Moderate" << endl;
    else if(count_c > 10) cout << "Curly Braces Sufficient" << endl;

    cout << "\nAngular Brackets Status : ";
    cout << count_a << endl;
    if(count_a < 5) cout << "Angular Brackets Insufficient" << endl;
    else if(count_a > 5 && count_a < 10) cout << "Angular Brackets Moderate" << endl;
    else if(count_a > 10) cout << "Angular Brackets Sufficient" << endl;

    return 0;
}

