#include<iostream>
using namespace std;
int main()
{
   int r,c;
  cin>>r;
  cin>>c;
  int a1[r][c];
  
  int trans[r][c];
 for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
cin>>a1[i][j];
    }
  }
  for(int i=0;i<c;i++)
  {
    for(int j =0;j<r;j++)
    {
      cout<<a1[j][i]<<" ";
    }
  cout<<endl;
  }
}
