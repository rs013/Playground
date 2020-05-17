// Gardening

#include <iostream>

using namespace std;

int main()
{
    int rows,cols,treeno;
    cin>>rows>>cols>>treeno;
    if(treeno > rows and treeno <= rows*2)
    {
        cout << "It is a mango tree";
    }
    else if (treeno > rows*(cols-2) and treeno <= rows*(cols - 1))
    {
        cout << "It is a mango tree";
    }
    else
    {
        cout << "It is not a mango tree";
    }
    return 0;
}