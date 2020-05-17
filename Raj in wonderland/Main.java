#include<iostream>
int main()
{
  int x,y;
  std::cin>>x;
  y=x%2;
  (y==0)?std::cout<<"Possible":std::cout<<"Not possible";
}