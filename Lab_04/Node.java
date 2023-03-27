public class Node<E> {

    public E element;
    public Node<E> next;

    // Constructor
    public Node() {
        this.element = null;
    }
    public Node(E e) {
        this.element = e;
    }
}