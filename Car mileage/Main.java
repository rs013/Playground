// Car mileage

#include <iostream>

using namespace std;

int main()
{
    float mileage, r_dist;
    int petrol, distance;
    cin>>mileage>>petrol>>distance;
    
    r_dist = mileage*petrol;
    if(distance <= r_dist)
    {
        cout<<"Can reach";
    }
    else
    {
        cout<<"Cannot reach";
    }
    return 0;
}