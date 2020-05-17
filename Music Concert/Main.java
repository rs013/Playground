#include<iostream>
using namespace std;

int main(){
  int n,m=0,f=0;
  int a[100];
  cin>>n;
  
  for(int i=0;i<n;i++)
  {
    cin>> a[i]; 

  }
  for(int j=0;j<n;j++)
  {
   if(a[j]%2==0)
   {
    m=m+1;
   }
    else
    {
      f=f+1;
    }
  }
    cout<<f<<endl;
    cout<<m<<endl;
  }