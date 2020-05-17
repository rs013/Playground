#include<iostream>
using namespace std;
int main()
{
  int n,a,b,sum;
  cin>>n;
  do
  {
    a=n%10;
    b=n/10;
    sum=a+b;
    n=sum;
  }while(n%10!=n);
  cout<<n;
}