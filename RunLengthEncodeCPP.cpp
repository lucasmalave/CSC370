#include <iostream>
#include <string>

//lucasmalave

using namespace std;

void runlengthencode(string str)
{
    int count = 0;
    
    char prev = str[0];
    
    string test;
    
    for(int i = 0; i < str.length(); i++)
    {
        char curr = str[i];
        
        if(curr == prev)
            count++;
        else
        {
            if(count > 4)
            {
                test += "/";
                test += to_string(count);
                test += prev;
            }
            else
            {
                for(int x = 0; x < count; x++)
                    test += prev;
            }
            
            count = 0;
        }
        
        prev = curr;
    }
    
    if(count > 4)
    {
        test += "/";
        test += to_string(count);
        test += prev;
    }
    else
    {
        for(int x = 0; x < count; x++)
            test += prev;
    }
    
    cout << test;
}

int main()
{
    string value = "";
    cin >> value;
    
    if(value.length() == 0)
        cout << "The string is empty.";
        
    runlengthencode(value);
}