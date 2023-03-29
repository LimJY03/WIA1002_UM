public class TowerOfHanoi {

    public static void fill(MyStack<Integer> rod, int[] arr) { 
        for (int elem: arr) rod.push(elem);
    }

    // Recursion
    public static void start(int startDiscsLeft, MyStack<Integer> start, MyStack<Integer> target, MyStack<Integer> helper) {

        // Base Case
        if (startDiscsLeft == 1) {
            target.push(start.pop());
            return;
        }

        // Move
        start(startDiscsLeft - 1, start, helper, target);
        target.push(start.pop());

        // Reset
        start(startDiscsLeft - 1, helper, target, start);
    }
    
    public static void main(String[] args) {

        MyStack<Integer> rod1 = new MyStack<>();
        MyStack<Integer> rod2 = new MyStack<>();
        MyStack<Integer> rod3 = new MyStack<>();

        int[] tower = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
             
        // Fill Rod1
        fill(rod1, tower);

        // Display Initial
        System.out.println("\nInitial\n===");
        System.out.printf("Rod 1: %s\n", rod1.toString());
        System.out.printf("Rod 2: %s\n", rod2.toString());
        System.out.printf("Rod 3: %s\n", rod3.toString());

        // Start Recursion
        start(tower.length, rod1, rod2, rod3);

        // Display Final
        System.out.println("\nFinal\n===");
        System.out.printf("Rod 1: %s\n", rod1.toString());
        System.out.printf("Rod 2: %s\n", rod2.toString());
        System.out.printf("Rod 3: %s\n", rod3.toString());
    }
}
