package Lab_11;

public class L11Q2 {

    public void selectionSortLargest(int[] arr) {

        // Iterate from start to end
        for (int i = 0; i < arr.length; i++) {
            
            int maxElem = arr[i];
            int maxIndex = i;
            boolean needSwap = false;

            // Get smallest value
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > maxElem) {
                    maxElem = arr[j];
                    maxIndex = j;
                    needSwap = true;
                }
            }

            // Swap values
            if (needSwap) arr[i] = (arr[i] + maxElem) - (arr[maxIndex] = arr[i]);
        }
    }
}
