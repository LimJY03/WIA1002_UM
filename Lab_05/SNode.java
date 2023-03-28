public class SNode<E> {

    E val;
    SNode<E> next;

    // Constructor
    public SNode() {
        this.val = null;
    }
    public SNode(E e) {
        this.val = e;
    }
}