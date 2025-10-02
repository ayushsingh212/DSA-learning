#include <iostream>  //Checks the 2 consicutive element of the array and swaps them is the first element is greater
using namespace std;

int main()
{
    int arr[] = {8,3,5,1,9,4};
    int n = 6;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n-1;j++)
        {

            if(arr[j]>arr[j+1])
                swap(arr[j], arr[j+1]);
        }
    }

    for(int i=0;i<n;i++)
    {
        cout<<arr[i]<<" ";
    }
}