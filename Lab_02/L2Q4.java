public class L2Q4 {
    
    public static <T extends Comparable<T>> String minmax(T[] arr) {
        T max = arr[0], min = arr[0];
        for (T t: arr) { 
            if (t.compareTo(max) > 0) max = t; 
            else if (t.compareTo(min) < 0) min = t;
        }
        return String.format("Min = %s Max = %s", min, max);
    }
}
