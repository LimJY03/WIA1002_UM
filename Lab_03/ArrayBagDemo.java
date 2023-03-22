public class ArrayBagDemo {

    // Main
    public static void main(String[] args) {
        
        BagInterface<String> bag1 = new ArrayBag<>();
        BagInterface<String> bag2 = new ArrayBag<>();
        String[] contentsOfBag1 = {"A", "A", "B", "A", "C", "A"};
        String[] contentsOfBag2 = {"A", "B", "A", "C", "B", "C", "D", "another string"};

        // Test Add
        System.out.println("bag1:"); testAdd(bag1, contentsOfBag1); displayBag(bag1);
        System.out.println("bag2:"); testAdd(bag2, contentsOfBag2); displayBag(bag2);
        
        System.out.println("bag3:"); displayBag(bag1.union(bag2));
        System.out.println("bag4:"); displayBag(bag1.intersect(bag2));
        System.out.println("bag5:"); displayBag(bag1.difference(bag2));
    }

    // Methods
    private static void testAdd(BagInterface<String> aBag, String[] content) {
        
        System.out.print("Adding ");

        for (String elem: content) {
            System.out.printf("%s ", elem);
            aBag.add(elem);
        }

        System.out.println();
    }
    private static void displayBag(BagInterface<String> aBag) {
        
        System.out.printf("The bag contains %d string(s), as follows:\n", aBag.getCurrentSize());

        Object[] bag = aBag.toArray();

        for (int i = 0; i < aBag.getCurrentSize(); i++) System.out.printf("%s ", bag[i]);

        System.out.println("\n");
    }
}