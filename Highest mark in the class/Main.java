#include<iostream>
using namespace std;
int main()
{
  int n,max=0;
  cin>>n;
  int arr[n];
  for(int i=0;i<n;i++)
  {
    cin>>arr[i];
    if (max<arr[i])
    {
      max = arr[i];
    }
  }
  cout<<max;
}