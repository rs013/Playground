#include<iostream>
using namespace std;
int main()
{
 string str1;
  cin>>str1;
  int rail;
  cin>>rail;
  
  if(str1=="front")
  {
    if(rail==1)
    {
      
      cout<<"Left Handed";
    }
    else
    {
      cout<<"Right Handed";
    }
  }
  else if(str1=="rear")
  {
    if(rail==1)
    {
      cout<<"Right Handed";
    }
    else
    {
      cout<<"Left Handed";
    }
  }
}