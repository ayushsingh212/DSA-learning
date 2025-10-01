public class MergeSort {
    // Merge two sorted parts of the array into a single sorted piece
    public static void conquer(int[] arr, int si, int mid, int ei) {
        int[] merged = new int[ei - si + 1]; // Temporary array for merging
        int left = si; // Pointer for left subarray
        int right = mid + 1; // Pointer for right subarray
        int index = 0; // Index for merged array

        // Merge elements from both subarrays in sorted order
        while (left <= mid && right <= ei) {
            if (arr[left] <= arr[right]) {
                merged[index++] = arr[left++];
            } else {
                merged[index++] = arr[right++];
            }
        }

        // Copy remaining elements from left part if any
        while (left <= mid) {
            merged[index++] = arr[left++];
        }

        // Copy remaining elements from right part if any
        while (right <= ei) {
            merged[index++] = arr[right++];
        }

        // Copy merged array back into original array
        for (int i = 0; i < merged.length; i++) {
            arr[si + i] = merged[i];
        }
    }

    // Recursively divide the array into halves and sort them
    public static void divide(int[] arr, int si, int ei) {
        if (si >= ei) { // When the segment size is 1 or less, stop dividing
            return;
        }
        int mid = si + (ei - si) / 2; // Find middle index

        // Sort left half
        divide(arr, si, mid);
        // Sort right half
        divide(arr, mid + 1, ei);
        // Merge sorted halves
        conquer(arr, si, mid, ei);
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 2, 8, 1, 5}; // Example array
        int n = arr.length;

        // Start the sorting process
        divide(arr, 0, n - 1);

        // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
