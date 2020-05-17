#include<iostream>
using namespace std;
int main()
{
  int x,y,z;
    cout<<"Enter first number :";
  cout<<" Enter second number : Menu";
  cout<<"\n1.Addition"<<"\n2.Subtraction"<<"\n3.Multiplication"<<"\n4.Division"<<"\n5.Remainder";

cin>>x;
  cin>>y;
  cin>>z;
  switch(z)
  {
    case 1 : cout<<"\n"<< x+y;
  break;
  case 2:cout<<"\n"<<x-y;
  break;
  case 3:cout<<"\n"<<x*y;
  break;
  case 4:cout<<"\n"<<x/y;
  break;
  case 5:cout<<"\n"<<x%y;
  break;
    default:cout<<"\nInvalid operation";
}
}