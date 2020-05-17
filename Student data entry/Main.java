#include <iostream>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
  struct student s;
  cout<<"\nStudent Details";
  cin.getline(s.name,50);
  cin>>s.roll;
  cin>>s.marks;
  cout<<"\nName: "<<s.name;
  cout<<"\nRoll: "<<s.roll;
  cout<<"\nMarks: "<<s.marks;
}