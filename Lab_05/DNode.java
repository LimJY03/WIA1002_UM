public class DNode<E> {
    
    public E val;
    public DNode<E> prev;
    public DNode<E> next;

    // Constructor
    public DNode(E e) { 
        this(e, null, null); 
    }
    public DNode(E e, DNode<E> prev, DNode<E> next) {
        this.val = e;
        this.prev = prev;
        this.next = next;
    }
}
