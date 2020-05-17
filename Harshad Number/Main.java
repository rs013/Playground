#include<iostream>
using namespace std;
int main()
{
 int temp,s=0,c;
  std::cin>>temp;
  int n=temp;
 do
  {
 c = temp%10;
   temp=temp/10;
  s=s+c;
  }while(temp!=0);


  if(n%s==0)
{
std::cout<<"Harshad Number";
  
}
  else
  {
    std::cout<<"Not Harshad Number";
  }
}