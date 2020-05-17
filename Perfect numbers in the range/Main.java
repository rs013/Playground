#include<iostream> 
using namespace std; 
  

bool isPerfect(long long int n) 
{ 
    // To store sum of divisors 
    long long int sum = 1; 
   
    // Find all divisors and add them 
    for (long long int i=2; i*i<=n; i++) 
    { 
        if (n%i==0) 
        { 
            if(i*i!=n) 
                sum = sum + i + n/i; 
            else
                sum=sum+i; 
        } 
    } 
     if (sum == n && n != 1) 
          return true; 
   
     return false; 
} 

int main() 
{ 
   int n1,n2;
   cin>>n1;
  cin>>n2;
    for (int i=n1; i<n2; i++) 
        if (isPerfect(i)) {
            cout << i <<" "; 
        }
   
    return 0; 
}