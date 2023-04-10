package Lab_10;

public class L10Q1 {
    
    public static void main(String[] args) {
        
        String s1 = "flabbergasted", s2 = "Astronaut";

        System.out.printf("%s -> %s\n", s1, substituteAI(s1));
        System.out.printf("%s -> %s\n", s2, substituteAI(s2));
    }

    public static String substituteAI(String s) {

        // Base Case
        if (s.isEmpty()) return "";

        // Recursion
        if (s.charAt(0) == 'a') return 'i' + substituteAI(s.substring(1));
        else return s.charAt(0) + substituteAI(s.substring(1));
    }
}
