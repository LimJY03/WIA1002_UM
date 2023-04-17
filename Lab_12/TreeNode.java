package Lab_12;

public class TreeNode<E> {

    public E val;
    public TreeNode<E> left;
    public TreeNode<E> right;
    
    // Constructor
    public TreeNode(E val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
