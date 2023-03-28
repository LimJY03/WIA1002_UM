public class SList<E> {

    SNode<E> head;
    SNode<E> tail;
    int size = 0;

    // Constructor
    public SList() {
        this.head = null;
        this.tail = null;
    }

    // Methods
    public void appendEnd(E e) {
        SNode<E> newNode = new SNode<>(e);
        if (this.size == 0) this.head = this.tail = newNode;
        else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.size++;
    }
    public E removeInitial() {

        if (this.size == 0) return null;
        
        E nodeVal = this.head.val;
        if (this.size == 1) this.head = this.tail = null;
        else this.head = this.head.next;

        this.size--;
        return nodeVal;
    }
    public boolean contains(E e) {
        SNode<E> currentNode = this.head;
        while (currentNode != null) {
            if (currentNode.val == e) return true;
            currentNode = currentNode.next;
        }
        return false;
    }
    public void clear() {
        this.head = this.tail = null;
        this.size = 0;
        System.out.println("The list is empty.");
    }
    public void display() {
        System.out.print("[ ");
        SNode<E> currentNode = this.head;
        while (currentNode != null) {
            System.out.printf("\"%s\" ", currentNode.val.toString());
            currentNode = currentNode.next;
        }
        System.out.println("]");
    }
}