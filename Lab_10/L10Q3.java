package Lab_10;

public class L10Q3 {
    
    public static void main(String[] args) {
        
        System.out.println(exponent(10, 3));
    }

    public static long exponent(int x, int m) {

        // Base Case
        if (m == 0) return 1;

        // Recursion
        return x * exponent(x, m - 1);
    }
}
