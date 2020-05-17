#include<iostream>
using namespace std;
int main()
{
  int a,b,c,x,y,z,p,q,r,m,n,o;
  cin>>x;
  cin>>y;
  cin>>z;
  cin>>p;
  cin>>q;
  cin>>r;
  cin>>m;
  cin>>n;
  cin>>o;
  a=x-(x*y/100)+z;
  b=p-(p*q/100)+r;
    c=m-(m*n/100)+o;
  cout<<"In Flipkart Rs."<<a;
  cout<<"\nIn Snapdeal Rs."<<b;
  cout<<"\nIn Amazon Rs."<<c;
  if (a<=b&&a<=c)
  { cout<<"\nHe will prefer Flipkart";
  }
  else if(b<=c)
  { cout<<"\nHe will prefer Snapdeal";
  }
  else 
  {cout<<"\nHe will prefer Amazon";
  }
}