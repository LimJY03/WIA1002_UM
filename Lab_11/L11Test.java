package Lab_11;

public class L11Test {
    
    public static void main(String[] args) {
        
        int[] arr = {45, 7, 2, 8, 19, 3};

        new L11Q1().selectionSortSmallest(arr);
        printIntArr(arr);
        
        new L11Q2().selectionSortLargest(arr);
        printIntArr(arr);

        int[] arr2 = {10, 34, 2, 56, 7, 67, 88, 42};

        new L11Q4().insertionSort(arr2);
        printIntArr(arr2);
    }

    public static void printIntArr(int[] arr) {
        String arrToString = "";
        for (int elem: arr) arrToString += String.format("%d, ", elem);
        System.out.printf("Sorted Array: [%s]\n", arrToString.substring(0, arrToString.length() - 2));
    }
}
