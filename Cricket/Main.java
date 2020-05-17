// Cricket

#include <iostream>
#include <cmath>

using namespace std;

int main()
{
    // t = total, c = current, r = required
    
    float t_runs,t_balls,c_runs,c_balls;
    cin>>t_balls>>t_runs>>c_runs>>c_balls;
    
    float t_overs,r_runrate,c_overs,c_runrate;
    // fmod is function in library cmath which gives remainder in float values.
    t_overs = int(t_balls/6) + fmod(t_balls,6)/10;
    c_overs = int(c_balls/6) + fmod(c_balls,6)/10;
    r_runrate = (t_runs/t_overs);
    c_runrate = (c_runs/c_overs);
    
    cout<<t_overs<<endl<<c_overs<<endl;
    printf("%.1f \n",c_runrate);
    printf("%.1f \n",r_runrate);
    
    if(r_runrate <= c_runrate)
    {
        cout<<"Eligible to Win";
    }
    else
    {
        cout<<"Not Eligible to Win";
    }
    return 0;
}