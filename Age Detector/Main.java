#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int birth, current;
  cin>>birth;
  cin>>current;
  if(birth<current)
  {
  cout<<current-birth;
  } else
  {
    cout<<100-(birth-current);
  }
  return 0;
}