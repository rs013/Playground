#include<iostream>
using namespace std;
int main()
{
  int n,sum=0,sum1=0;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
cin>>a[i];
  }
  for(int j=0;j<n;j++)
  {
    if(a[j]%2==0)
    {
      sum=sum+a[j];
    }
    else
    {
      sum1=sum1+a[j];
    }
    
  }
  cout<<"The sum of the even numbers in the array is "<<sum<<endl;
  cout<<"The sum of the odd numbers in the array is "<<sum1;
}