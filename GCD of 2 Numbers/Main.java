#include<iostream>
using namespace std;
int main()
{
  int n1,n2,small,gcd;
  cin>>n1>>n2;
  if(n1<n2)
  {
    small=n1;
  }
  else
  {
    small=n2;
  }
 do
 {
   if(n1%small==0 && n2%small==0)
  {
    gcd=small;
    break;
   }
     
  
  small--;
 }while(small>=1);
  cout<<"G.C.D of "<<n1<<" and "<<n2<<" = "<<gcd;
}