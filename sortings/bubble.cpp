// Bubble sort is a simple sorting method that repeatedly compares adjacent elements in an array and swaps them
// if they are in the wrong order. This process repeats until the whole array is sorted, 
// with larger elements "bubbling" to the end after each pass.

#include <iostream>  
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
