#include<iostream>
using namespace std;
int main()
{
  int n,m,v;
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>n;
  int arr[n];
  cout<<"Enter the elements in the array"<<endl;
  for(int i = 0;i<n;i++)
  {
    cin>>arr[i];
  }
  cout<<"Enter the location where you wish to insert an element"<<endl;
  cin>>m;
  if(m>n)
  {
    cout<<"Invalid Input";
  }
  else
  {
  cout<<"Enter the value to insert"<<endl;
  cin>>v;
  cout<<"Array after insertion is"<<endl;
  for(int i = 0;i<n;i++)
  {
    if(i==m-1)
    {
      cout<<v<<endl;
      cout<<arr[i]<<endl;
    }
    else
    {
      cout<<arr[i]<<endl;
    }
  }
  }
  
}