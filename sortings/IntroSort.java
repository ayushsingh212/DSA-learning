public class IntroSort {

    private static final int SIZE_THRESHOLD = 16;  // Threshold for insertion sort

    public static void sort(int[] arr) {
        int maxDepth = (int) (2 * Math.floor(Math.log(arr.length) / Math.log(2)));
        introSortUtil(arr, 0, arr.length - 1, maxDepth);
    }

    private static void introSortUtil(int[] arr, int start, int end, int maxDepth) {
        int size = end - start + 1;

        if (size <= SIZE_THRESHOLD) {
            insertionSort(arr, start, end);
            return;
        }

        if (maxDepth == 0) {
            heapSort(arr, start, end);
            return;
        }

        int pivot = partition(arr, start, end);
        introSortUtil(arr, start, pivot - 1, maxDepth - 1);
        introSortUtil(arr, pivot + 1, end, maxDepth - 1);
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void insertionSort(int[] arr, int start, int end) {
        for (int i = start + 1; i <= end; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= start && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    private static void heapSort(int[] arr, int start, int end) {
        int length = end - start + 1;

        for (int i = start + length / 2 - 1; i >= start; i--) {
            heapify(arr, length, i, start);
        }

        for (int i = end; i > start; i--) {
            swap(arr, start, i);
            heapify(arr, i - start, start, start);
        }
    }

    private static void heapify(int[] arr, int heapSize, int i, int offset) {
        int largest = i;
        int left = 2 * (i - offset) + 1 + offset;
        int right = 2 * (i - offset) + 2 + offset;

        if (left < offset + heapSize && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < offset + heapSize && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, heapSize, largest, offset);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {22, 11, 88, 66, 55, 77, 33, 44};
        System.out.println("Original array:");
        printArray(arr);
        sort(arr);
        System.out.println("Sorted array:");
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int v : arr) {
            System.out.print(v + " ");
        }
        System.out.println();
    }
}
