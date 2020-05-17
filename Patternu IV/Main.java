#include <iostream>
using namespace std;
int main() {
    int x;
  cin>>x;
  for(int i=1;i<=x;i++)
  {
    for(int j=1;j<=x;j++)
    {
      if(i%2==0)
      {
        if(j==1)
        {
          cout<<(i+1);
          continue;
        }
        cout<<i;
      }
      else
      {
        if(j==x)
        {
          cout<<(i+1);
          break;
        }
        cout<<i;
      }
    }
    cout<<endl;
    
  }
}