#include <iostream>

using namespace std;

int main()
{
    int side,radius;
    cin>>radius>>side;
    
    if(side >= radius*2)
    {
        cout<<"circle can be inside a square";
    }
    else
    {
        cout<<"circle cannot be inside a square";
    }
    return 0;
}