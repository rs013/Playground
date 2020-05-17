#include <bits/stdc++.h> 
using namespace std; 
  
int isMagicSquare(int matrix[50][50], int n); 
  
int main(){
  	int n;
    int matrix[50][50];
	cin >> n;
    for(int i = 0; i < n; i++)
        for(int j = 0; j < n; j++)
            cin>>matrix[i][j];

    if (isMagicSquare(matrix, n))
        cout << "Yes"; 
    else
        cout << "No";     
    return 0; 
}

int isMagicSquare(int matrix[50][50], int n){  

    int sum1 = 0, sum2=0;

    //finding the sum of first diagonal
    for (int i = 0; i < n; i++) 
    {   sum1 = sum1 + matrix[i][i];}

    //finding the sum of seciond diagonal
    for (int i = 0; i < n; i++) 
    {   sum2 = sum2 + matrix[i][n - 1 - i];}
    
    //Checking, whether the sum of two diagonal is same or not
    if(sum1 != sum2)  
    {  return 0; }
 	return 1; 
}