#include<iostream>
using namespace std;
int main()
{
  int i,j,k,l,x;
  cin>>x;
  for(k=i=1;i<=x;i++)
  {
    l=k+i-1;
    for(j=1;j<=i;j++)
    {
      if(i%2==1)
        cout<<k;
      else
        cout<<l;
      k++;
      l--;
      if(j!=i)
      {
        cout<<"*";
      }
    }
    printf("\n");
  }
  return 0;
}