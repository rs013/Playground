#include<iostream>
using namespace std;
int main()
{
  int n, count=0,a=0,b=6;
  cin>>n;
  do
  {
    b=b+5*a;
    cout<<b<<" ";
    a++;
    count++;
  }while(count!=n);
}