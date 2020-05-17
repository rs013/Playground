#include<iostream>
using namespace std;
int main()
{
  int n , a=11 , count=0;
  cin>>n;
  do
  {
    int sqr = a*a;
    cout<<sqr<<" ";
    a=a+4;
    count++;
  }while(count!=n);
}