#include<iostream>
using namespace std;
int main()
{
  int a,n,count=0;
  cin>>a>>n;
  int num=1;
  do
  {
    num=num*a;
    count++;
  }while(count<n);
  cout<<"Enter the value of a"<<endl;
  cout<<"Enter the value of n"<<endl;
  
  
  cout<<"The value of "<<a <<" power "<<n<<" is "<<num <<endl;
}