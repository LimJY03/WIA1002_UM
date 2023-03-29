public class TestMyStack {
    
    public static void main(String[] args) {

        MyStack<Character> stack = new MyStack<>();

        stack.push('a');
        stack.push('b');
        stack.push('c');

        System.out.println(stack.toString());

        System.out.printf("'b' is in stack? %s\n", stack.search('b'));
        System.out.printf("'k' is in stack? %s\n", stack.search('k'));

        MyStack<Integer> stack2 = new MyStack<>();

        stack2.push(1);
        stack2.push(2);
        stack2.push(3);

        System.out.println(stack2.toString());

        System.out.printf("'6' is in stack? %s\n", stack2.search(6));
    }
}
