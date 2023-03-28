import java.util.NoSuchElementException;

public class DoublyLinkedList<E> {

    private DNode<E> head;
    private DNode<E> tail;
    private int size = 0;

    // Constructor
    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Methods
    public void addFirst(E e) {
        DNode<E> firstNode = new DNode<>(e, null, this.head);
        if (this.head != null) this.head.prev = firstNode;
        this.head = firstNode;
        if (this.tail == null) this.tail = firstNode;
        this.size++;
        System.out.println("adding: " + e);
    }
    public void addLast(E e) {
        DNode<E> lastNode = new DNode<>(e, this.tail, null);
        if (this.tail != null) this.tail.next = lastNode;
        this.tail = lastNode;
        if (this.head == null) this.head = lastNode;
        this.size++;
        System.out.println("adding: " + e);
    }
    public void add(int index, E e) {
        if (index < 0 || index > this.size) throw new IndexOutOfBoundsException();
        if (index == 0) this.addFirst(e);
        else if (index == this.size) this.addLast(e);
        else {
            DNode<E> currentNode;
            if (index < (this.size + 1) / 2) {
                currentNode = this.head;
                for (int i = 0; i < index; i++) currentNode = currentNode.next;
            }
            else {
                currentNode = this.tail;
                for (int i = this.size - 1; i > index; i--) currentNode = currentNode.prev;
            }
            DNode<E> newNode = new DNode<>(e, currentNode.prev, currentNode);
            currentNode.prev.next = newNode;
            currentNode.prev = newNode;
            this.size++;
        }
    }
    private E removeFirst() {
        if (size == 0) throw new NoSuchElementException();
        DNode<E> firstNode = this.head;
        this.head = this.head.next;
        this.head.prev = null;
        this.size--;
        System.out.println("deleted: " + firstNode.val);
        return firstNode.val;
    }
    private E removeLast() {
        if (size == 0) throw new NoSuchElementException();
        DNode<E> lastNode = this.tail;
        this.tail = this.tail.prev;
        this.tail.next = null;
        this.size--;
        System.out.println("deleted: " + lastNode.val);
        return lastNode.val;
    }
    public E remove(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        DNode<E> currentNode;
        if (index == 0) return this.removeFirst();
        if (index == this.size - 1) return this.removeLast();
        if (index < (this.size + 1) / 2) {
            currentNode = this.head;
            for (int i = 0; i < index; i++) currentNode = currentNode.next;
        }
        else {
            currentNode = this.tail;
            for (int i = this.size - 1; i > index; i--) currentNode = currentNode.prev;
        }
        currentNode.prev.next = currentNode.next;
        currentNode.next.prev = currentNode.prev;
        currentNode.next = currentNode.prev = null;
        this.size--;
        return currentNode.val;
    }
    public void traverseForward() {
        System.out.println("Iterating forward..");
        DNode<E> currentNode = this.head;
        while (currentNode != null) {
            System.out.printf("%s ", currentNode.val);
            currentNode = currentNode.next;
        }
        System.out.println();
    }
    public void traverseBackward() {
        System.out.println("Iterating backward..");
        DNode<E> currentNode = this.tail;
        while (currentNode != null) {
            System.out.printf("%s ", currentNode.val);
            currentNode = currentNode.prev;
        }
        System.out.println();
    }
    public int getSize() { return this.size; }
    public void clearAll() { 
        DNode<E> currentNode = this.head;
        while (this.head != null) {
            currentNode = this.head.next;
            this.head.prev = this.head.next = null;
            this.head = currentNode;
        }
        this.tail.prev = this.tail.next = null;
        System.out.printf("Successfully cleared %d nodes.\n", this.size);
        this.size = 0;
    }
}
