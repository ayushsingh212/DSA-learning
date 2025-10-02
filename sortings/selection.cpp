#include <iostream>  //Checks the Unsorted portion for the next smallest number
using namespace std;

int main()
{
    int arr[] = {8,3,5,1,9,4};
    int n = 6;
    for(int i=0;i<n-1;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(arr[j]<arr[i])
                swap(arr[j], arr[i]);
        }
    }

    for(int i=0;i<n;i++)
    {
        cout<<arr[i]<<" ";
    }
}