package Lab_10;

public class L10Q2 {
    
    public static void main(String[] args) {
        
        permuteString("ABCD");
    }

    // For Calling Purpose
    public static void permuteString(String strToPermute) { permuteString("", strToPermute); }

    // Method Overloading: For Recursion
    public static void permuteString(String strDonePermute, String strToPermute) {

        // Base Case
        if (strToPermute.length() == 0) {
            System.out.println(strDonePermute);
            return;
        }

        // Iterate to each character through strToPermute
        for (int i = 0; i < strToPermute.length(); i++) {

            // Recursion
            permuteString(

                // Refrain iterated character from permuting again
                strDonePermute + strToPermute.charAt(i),

                // Remove iterated character from next permutation
                strToPermute.substring(0, i) + strToPermute.substring(i + 1)
            );
        }
    }
}
