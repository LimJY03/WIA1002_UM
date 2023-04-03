package Lab_07;

public class MyQueueTest {
    
    public static void main(String[] args) {

        String[] initialQ = {"Durian", "Blueberry"};
        MyQueue<String> fruitQ = new MyQueue<>(initialQ);

        fruitQ.enqueue("Apple");
        fruitQ.enqueue("Orange");
        fruitQ.enqueue("Grapes");
        fruitQ.enqueue("Cherry");

        System.out.println(fruitQ.toString());
        System.out.printf("Size of fruitQ: %s\n", fruitQ.getSize());

        fruitQ.dequeue();

        System.out.println(fruitQ.getElement(2));
        System.out.printf("'Cherry' in fruitQ? %s\n", fruitQ.contains("Cherry"));
        System.out.printf("'Durian' in fruitQ? %s\n", fruitQ.contains("Durian"));

        while (!fruitQ.isEmpty()) System.out.printf("%s ", fruitQ.dequeue());

        System.out.println();
    }
}
