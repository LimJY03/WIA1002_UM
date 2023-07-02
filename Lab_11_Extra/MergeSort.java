package Lab_11_Extra;

import Lab_11.L11Test;

public class MergeSort {
    
    public static void mergeSort(int[] arr) {

        if (arr == null || arr.length <= 1) return;

        // Initiate recursion
        mergeSort(arr, new int[arr.length], 0, arr.length - 1);
    }
    private static void mergeSort(int[] arr, int[] helper, int low, int high) {

        // Base case
        if (low == high) return;

        int mid = (low + high) / 2;

        // Split left segment
        mergeSort(arr, helper, low, mid);
        
        // Split right segment
        mergeSort(arr, helper, mid + 1, high);
        
        // Combine array
        combine(arr, helper, low, mid, high);
    }
    private static void combine(int[] arr, int[] helper, int low, int mid, int high) {

        // Load segment to helper
        for (int i = low; i <= high; i++) helper[i] = arr[i];

        // Pointer to start for both arrays to merge
        int iLeftArr = low;
        int iRightArr = mid + 1;
        int current = low;

        while (current <= high) {

            // Left elem < right elem
            if (iLeftArr <= mid && (iRightArr > high || helper[iLeftArr] < helper[iRightArr])) {
                arr[current] = helper[iLeftArr];
                iLeftArr++;
            }

            // Left elem > right elem
            else {
                arr[current] = helper[iRightArr];
                iRightArr++;
            }

            // Move to next index at merged array 
            current++;
        }
    }

    public static void main(String[] args) {

        int[] arr = {45, 7, 2, 8, 19, 3};
        int[] arr2 = {10, 34, 2, 56, 7, 67, 88, 42};
        int[] arr3 = {90, 8, 7, 56, 125, 237, 9, 1, 653};
        int[] arr4 = {10, 7, 20, 10, 5};

        mergeSort(arr);
        mergeSort(arr2);
        mergeSort(arr3);
        mergeSort(arr4);

        L11Test.printIntArr(arr);
        L11Test.printIntArr(arr2);
        L11Test.printIntArr(arr3);
        L11Test.printIntArr(arr4);
    }
}
