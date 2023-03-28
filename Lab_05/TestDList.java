public class TestDList {
    
    public static void main(String[] args) {
        
        DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();

        dll.addFirst(1);
        dll.add(1, 10);
        dll.addLast(100);
        dll.add(2, 2);

        dll.remove(3);

        dll.traverseForward();
        dll.traverseBackward();

        System.out.printf("Size of current Doubly Linked List: %d\n", dll.getSize());
        
        dll.clearAll();

        System.out.printf("Size of current Doubly Linked List: %d\n", dll.getSize());
    }
}
