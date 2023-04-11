package Lab_11;

public class L11Q1 {

    public void selectionSortSmallest(int[] arr) {

        // Iterate from start to end
        for (int i = 0; i < arr.length; i++) {
            
            int minElem = arr[i];
            int minIndex = i;
            boolean needSwap = false;

            // Get smallest value
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < minElem) {
                    minElem = arr[j];
                    minIndex = j;
                    needSwap = true;
                }
            }

            // Swap values
            if (needSwap) arr[i] = (arr[i] + minElem) - (arr[minIndex] = arr[i]);
        }
    }
}
