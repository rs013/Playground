#include<iostream>
using namespace std;
int main()
{
int a,b,c,d,e=0,f=0;
cin>>a>>b>>c>>d;
e=a+c;
f=b+d;
if(f>100)
{
  e=e+1;
  f=f-100;
}
cout<<e<<endl;
cout<<f;
}