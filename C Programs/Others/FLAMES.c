#include <stdio.h>
#include <string.h>

int main()
{
    char str1[100],str2[100],ch1,ch2;
    int n,index[100],i=0,j=0,length=0,indexx = 0;
    char flames[]= {"Friends" , "Love" , "Affair" , "Marraige" , "Enemy" , "Sex"};

    for(i = 0 ; i<100 ;index[i] = -1,i++);

    printf("Enter First Name -->\n");
    scanf("%s",str1);
    
    printf("Enter Second Name -->\n");
    scanf("%s",str2);

    n = (len(str1)>len(str2))?len(str2):len(str1);
    
    for (i = 0; i < n; i++)
    {
        ch1 = len(str1)>len(str2)?str2[i]:str1[i];

        for (j = 0; j < (len(str1)>len(str2))?len(str1):len(str2); j++)
        {
            ch2 = len(str1)>len(str2)?str1[j]:str2[j];
            if(strcmp(ch1,ch2) == 0)
            {
                str2[j] = '-';
                index[i]=i;
            }
        }
    }

    i=0;

    while(index[i]!=-1)
    {
        str1[index[i]] = '-';
        i++;
    }

    for(i=0;i<len(str1);i++)
    if(!(strcmp(str1[i],'-') == 0))
    length++;

    for(i=0;i<len(str2);i++)
    if(!(strcmp(str2[i],'-') == 0))
    length++;

    for(i=0;i<length;i++,indexx++)
    {
        if(index>6)
        indexx = 0;
    }
    
    printf("%s\n",flames[indexx]);
}