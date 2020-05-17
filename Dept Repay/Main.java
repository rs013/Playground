#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,r;
  cin>>x;
  cin>>r;
  cin>>y;
  int si,amt;
  float d,s;
  si=(x*y*r)/100;
  amt=x+si;
  d=(2*si)/100.00;
  s=float(x+(si-d));
  std::cout<<si<<"\n"<<amt<<"\n"<<d<<"\n"<<s;
  
}