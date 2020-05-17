#include <iostream>
using namespace std;
int main()
{
  int x;
  float a=0.5f;
  cin>>x;
  cout<<a<<" ";
  for(int i=1;i<x;i++)
  {
    a=a*3;
    cout<<a<<" ";
  }
}