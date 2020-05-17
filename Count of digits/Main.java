#include<iostream>
using namespace std;
int main()
{
 int no,a=0;
  cin>>no;
do
{
 no=no/10;
  a++;
}while(no>0);
  cout<<a;
  return 0;
}