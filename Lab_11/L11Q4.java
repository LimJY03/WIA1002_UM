package Lab_11;

public class L11Q4 {
    
    public void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            int thisElem = arr[i], j;

            // Check previous elements and shift right
            for (j = i; (j > 0) && (arr[j - 1] > thisElem); j--) arr[j] = arr[j - 1];

            // Insert the element at index j
            arr[j] = thisElem;
        }
    }
}