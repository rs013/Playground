#include<iostream>
using namespace std;
int main()
{
  int n,count;
  cin>>n;
  cout<<n<<endl;
   if(n==1)
    {
      
      cout<<0;
    }
else{
  do
  {
     if(n%2==0)
  {
    n=n/2;
  }
  else
  {
    n=3*n+1;
  }
    cout<<n<<endl;
    count++;
  }while(n!=1);
  cout<<count;
}
}