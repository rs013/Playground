#include<iostream>
using namespace std;
void check(int m ,int n,int req){
  int ans =1;
  for(int i=1;i<=n;i++){
    ans = ans*m;
  }
  if(ans >= req){
    cout<<"Doctor, you can proceed with your experiment."<<endl;
  }
  else{
    cout<<"Sorry Doctor! You need more bacteria."<<endl;
  }
}
int main()
{
  int m , n , req;
  cin>>m;
  cin>>n;
  cin>>req;
 check(m,n,req);
}