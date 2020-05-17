#include <iostream>

using namespace std;

int main()
{
    int r,c,i,j,sum = 0;
    cin>>r>>c;
    int arr[r][c];
    for(i = 0; i < r; i++)
    {
        for(j = 0; j < c; j++)
        {
            cin>>arr[i][j];
            if(i == 0 or i == r-1)
            {
                sum = sum + arr[i][j];
            }
            else
            {
                if(i+j == c-1)
                {
                    sum = sum + arr[i][j];
                }
            }
        }
    }
    cout<<"Sum of Zig-Zag pattern is "<<sum;
}