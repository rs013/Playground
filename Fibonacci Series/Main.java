#include<iostream> 
  
int fib(int n) 
{ 
  /* Declare an array to store Fibonacci numbers. */
  int f[n+2];   // 1 extra to handle case, n = 0 
  int i; 
  
  /* 0th and 1st number of the series are 0 and 1*/
  f[1] = 0; 
  f[2] = 1; 
  
  for (i = 3; i <= n; i++) 
  { 
      /* Add the previous 2 numbers in the series 
         and store it */
      f[i] = f[i-1] + f[i-2]; 
  } 
  
  return f[n]; 
} 
  
int main () 
{ 
  int n;
  std::cin>>n;
  std::cout<<"The term "<<n<<" in the fibonacci series is "<<fib(n);
  getchar(); 
  return 0; 
}