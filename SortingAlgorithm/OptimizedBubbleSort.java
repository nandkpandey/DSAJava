package SortingAlgorithm;

public class OptimizedBubbleSort {
    public static void bubbleSort(int[] arr) {
        int swapCount;//or initialize it to -1

        do {
            swapCount = 0; // Reset swap counter to zero

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    // Swap arr[i] and arr[i + 1]
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapCount++; // Increment swap counter
                }
            }
        } while (swapCount != 0); // Repeat until no swaps are made
    }

    public static void main(String[] args) {
        
        int arr[]={5,12,23,1,2};
        bubbleSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
