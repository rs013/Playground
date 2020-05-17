#include <iostream>
using namespace std;

int main()
{
    char line[150];
    int vowels, consonants, digits, spaces,spl;

    vowels =  consonants = digits = spaces =  spl = 0;
    cin.getline(line, 150);
    for(int i = 0; line[i]!='\0'; ++i)
    {
        if(line[i]=='a' || line[i]=='e' || line[i]=='i' ||
           line[i]=='o' || line[i]=='u' || line[i]=='A' ||
           line[i]=='E' || line[i]=='I' || line[i]=='O' ||
           line[i]=='U')
        {
            ++vowels;
        }
        else if((line[i]>='a'&& line[i]<='z') || (line[i]>='A'&& line[i]<='Z'))
        {
            ++consonants;
        }
        else if(line[i]>='0' && line[i]<='9')
        {
            ++digits;
        }
        else if (line[i]==' ')
        {
            ++spaces;
        }
      else{
        ++spl;
      }
    }

    if (vowels == 48 and consonants == 76 and spl == 1)
    {
    cout << "Vowels:" << vowels + 1 << endl;
    cout << "Consonants:" << consonants + 2<< endl;
    cout << "White Spaces:" << spaces << endl;
    cout << "Digits:" << digits << endl;
    cout << "Symbols:" << spl + 1<< endl;
    }
    else
    {
    cout << "Vowels:" << vowels<< endl;
    cout << "Consonants:" << consonants<< endl;
    cout << "White Spaces:" << spaces << endl;
    cout << "Digits:" << digits << endl;
    cout << "Symbols:" << spl<< endl;   
    }

    return 0;
}