public class L6Q4 {

    public static boolean isPalindrome(String s) {
        
        MyStack<Character> stack = new MyStack<>();

        // Build Stack
        for (int i = 0; i < (s.length() + 1) / 2 ; i++) stack.push(s.charAt(i));

        // Pop Stack
        for (int i = s.length() / 2; i < s.length(); i++) if (stack.pop() != s.charAt(i)) return false;

        return true;
    }

    public static void main(String[] args) {

        System.out.printf("Is 'cfghjhgfc' palindromic? %s\n", isPalindrome("cfghjhgfc"));
        System.out.printf("Is 'cfghjjhgfc' palindromic? %s\n", isPalindrome("cfghjjhgfc"));
        System.out.printf("Is 'cfghjhgfca' palindromic? %s\n", isPalindrome("cfghjhgfca"));
    }
}
