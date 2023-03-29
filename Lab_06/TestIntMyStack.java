import java.util.Scanner;

public class TestIntMyStack {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        MyStack<Integer> stack = new MyStack<>();

        System.out.print("Enter the upperbound integer: ");
        int upperBound = sc.nextInt();

        for (int i = 1; i <= upperBound; i++) stack.push(i);

        System.out.printf("Size of stack: %d\n", stack.getSize());

        while (!stack.isEmpty()) System.out.printf("%d ", stack.pop());

        // The values are printed in reversed order because the lastmost value is printed first.

        sc.close();
    }
}