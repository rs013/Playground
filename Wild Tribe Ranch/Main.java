#include<iostream>
using namespace std;
int main()
{
  int weight, capacity;
  std::cin>>capacity;
  std::cin>>weight;
  if(capacity>weight)
  {
    std::cout<<"Yes, you can enter.";
  }
    else if(weight==capacity)
    {
    std::cout<<"Yes, you can enter. Kindly use a rope.";
    }                                            
  else 
  {                        
  std::cout<<"Sorry, you can't enter";
  }
}