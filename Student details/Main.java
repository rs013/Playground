
#include <iostream>
#include <algorithm>
using namespace std;

struct Student
{
    // Variables in structure
    char name[30];
    char department[20];
    int yearOfStudy;
    float cgpa;
};

// Function to compare the alphabetical order
bool compareStudent(Student s1, Student s2) {
    int i;
    for(i=0;i<30;i++)
  { if(s1.name[i] < s2.name[i]) {
      return true;
    }
    else if(s1.name[i] > s2.name[i])
    {
        return false;
    }
 } 
}

int main()
{
    int n,i;
    cout<<"Enter the number of students"<<endl;
    cin>>n;
    // Creating an array of structures
    // Every element in the array points towards its corresponding sturcture
    struct Student arr[n];
    for(i=0;i<n;i++)
    {
        cout<<"Enter the details of student "<<i+1<<endl;
        cout<<"Enter name"<<endl;
        cin>>arr[i].name;
        cout<<"Enter department"<<endl;
        cin>>arr[i].department;
        cout<<"Enter year of study"<<endl;
        cin>>arr[i].yearOfStudy;
        cout<<"Enter cgpa"<<endl;
        cin>>arr[i].cgpa;
    }
    sort(arr, arr + n, compareStudent);
    cout<<"Details of students"<<endl;
    for(i=0;i<n;i++)
    {
        cout<<"Student "<<i+1<<endl;
        cout<<"Name:"<<arr[i].name<<endl;
        cout<<"Department:"<<arr[i].department<<endl;
        cout<<"Year of study:"<<arr[i].yearOfStudy<<endl;
        cout<<"CGPA:"<<arr[i].cgpa/1.00<<endl;
    }
}