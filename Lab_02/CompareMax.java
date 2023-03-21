public class CompareMax {
    
    public static <T extends Comparable<T>> T maximum(T a, T b, T c) {
        
        T result = a;

        if (c.compareTo(result) > 0) result = c;
        if (b.compareTo(result) > 0) result = b;
        
        return result;
    }
}
