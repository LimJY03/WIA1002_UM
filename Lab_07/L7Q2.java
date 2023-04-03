package Lab_07;

public class L7Q2 {

    public static boolean isPalindrome(String s) {

        MyQueue<Character> queue = new MyQueue<>();

        // Queue first half
        for (int i = 0; i < (s.length() + 1) / 2; i++) queue.enqueue(s.charAt(i));

        // Check second half
        for (int i = s.length() - 1; i >= (s.length() + 1) / 2; i--) {
            if (queue.dequeue() != s.charAt(i)) return false;
        }

        return true;
    }
}


class Tester {

    public static void main(String[] args) {
        
        String s1 = "racecar";
        String s2 = "raceecar";
        String s3 = "o";
        String s4 = "ol";

        System.out.println(L7Q2.isPalindrome(s1));
        System.out.println(L7Q2.isPalindrome(s2));
        System.out.println(L7Q2.isPalindrome(s3));
        System.out.println(L7Q2.isPalindrome(s4));
    }
}