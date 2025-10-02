// Insertion sort is a simple sorting algorithm that builds the sorted array one element at a time.
// It works like sorting playing cards in hand: take one element from the unsorted portion and 
// insert it into the correct position in the sorted portion. This process repeats until the entire list is sorted. 
// It is efficient for small or nearly sorted datasets.

#include <iostream>  //Checks the sorted portion where the next element should sit
using namespace std;

int main()
{
    int arr[] = {8,3,5,1,9,4};
    int n = 6;
    for(int i=1;i<n;i++)
    {
        int current = arr[i];
        int j=i-1;
        while(arr[j]>current && j>=0)
        {
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=current;
    }

    for(int i=0;i<n;i++)
    {
        cout<<arr[i];
    }
}