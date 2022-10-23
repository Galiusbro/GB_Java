// Реализовать алгоритм пирамидальной сортировки (HeapSort)

public class task3_1 {
    static int[] fillArray(int n) {
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 31));
        }
        return arr;
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.printf("%d ", arr[i]);
    }

    static void heap(int arr[], int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heap(arr, n, largest);
        }
    }

    static void sort(int arr[]) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heap(arr, n, i);

        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heap(arr, i, 0);
        }
    }

    public static void main(String[] args) {
        int n = 20;
        int[] arr = fillArray(n);

        printArray(arr);

        sort(arr);

        System.out.println("\nHeapSorted array:");
        printArray(arr);

    }
}