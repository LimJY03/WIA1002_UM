package Lab_12;

import java.util.ArrayList;

public class BST<E extends Comparable<E>> {

    private int size;
    public TreeNode<E> root;

    // Constructor
    public BST() {
        this.root = null;
        this.size = 0;
    }

    // Returns true if the element is in the tree
    public boolean search(E e) {

        TreeNode<E> currentNode = this.root;

        while (currentNode != null) {
            
            if (e.equals(currentNode.val)) return true;

            if (e.compareTo(currentNode.val) < 0) currentNode = currentNode.left;
            else currentNode = currentNode.right;
        }

        return false;
    }

    // Insert element o into the binary tree and return true if the element is inserted successfully
    public boolean insert(E e) {

        if (this.root == null) this.root = new TreeNode<>(e);

        else {

            TreeNode<E> currentNode = this.root;
            TreeNode<E> parentNode = currentNode;
            
            while (currentNode != null) {

                if (e.equals(currentNode.val)) return false;

                if (e.compareTo(currentNode.val) < 0) {
                    parentNode = currentNode;
                    currentNode = currentNode.left;
                }
                else {
                    parentNode = currentNode;
                    currentNode = currentNode.right;
                }
            }

            if (e.compareTo(parentNode.val) < 0) parentNode.left = new TreeNode<>(e);
            else parentNode.right = new TreeNode<>(e);
        }

        this.size++;
        return true;
    }

    // Get the number of nodes in the tree
    public int getSize() { return this.size; }

    // Returns the height of the BST
    public int height() { return this.height(this.root) - 1; }    
    private int height(TreeNode<E> node) {

        if (node == null) return 0;

        int heightLeft = this.height(node.left);
        int heightRight = this.height(node.right);

        return Math.max(heightLeft, heightRight) + 1;
    }

    // Returns the root of the BST
    public E getRoot() { return this.root.val; }

    // Returns the minimum value of the BST
    public E minValue() {
        
        TreeNode<E> currentNode = this.root;
        E minVal = null;

        while (currentNode != null) {
            minVal = currentNode.val;
            currentNode = currentNode.left;
        }

        return minVal;
    }

    // Returns the maximum value of the BST
    public E maxValue() {

        TreeNode<E> currentNode = this.root;
        E maxVal = null;

        while (currentNode != null) {
            maxVal = currentNode.val;
            currentNode = currentNode.right;
        }

        return maxVal;
    }
    

    // Returns a path from the root leading to the specified element
    public ArrayList<TreeNode<E>> path(E e) {

        if (!this.search(e)) return null;

        ArrayList<TreeNode<E>> pathToElement = new ArrayList<>();
        TreeNode<E> currentNode = this.root;

        while (currentNode != null) {

            pathToElement.add(currentNode);

            if (e.equals(currentNode.val)) break;

            currentNode = (e.compareTo(currentNode.val) < 0) ? currentNode.left : currentNode.right;
        }

        return pathToElement;
    }

    // Delete an element from the binary tree. Return true if the element is deleted successfully, and return false if the element is not in the tree
    public boolean delete(E e) {

        if (!this.search(e)) return false;

        TreeNode<E> currentNode = this.root;
        TreeNode<E> parentNode = currentNode;

        while (currentNode != null) {

            if (e.equals(currentNode.val)) break;

            if (e.compareTo(currentNode.val) < 0) {
                parentNode = currentNode;
                currentNode = currentNode.left;
            }
            else {
                parentNode = currentNode;
                currentNode = currentNode.right;
            }
        }

        if (currentNode.val.compareTo(parentNode.val) < 0) this.swapDeleteNode(parentNode.left, currentNode);
        else this.swapDeleteNode(parentNode.right, currentNode);

        return true;
    }

    private void swapDeleteNode(TreeNode<E> parentNodeReference, TreeNode<E> currentNode) {
        
        if (currentNode.left == null) parentNodeReference = currentNode.right;
        else if (currentNode.right == null) parentNodeReference = currentNode.left;

        else {
            
            TreeNode<E> tempNode = currentNode;

            while (currentNode != null) {
                tempNode = currentNode;
                currentNode = currentNode.right;
            }

            parentNodeReference.val = tempNode.right.val;
            tempNode.right = null;
        }
    }

    // Remove all elements from the tree
    public boolean clear() {
        this.deleteNode(this.root);
        return true;
    }
    private void deleteNode(TreeNode<E> node) {
        
        if (node.val != null) {
            this.deleteNode(node.left); node.left = null;
            this.deleteNode(node.right); node.right = null;
        }
    }
    
    // Display inorder traversal from a subtree
    protected void inorder(TreeNode<E> root) {
        if (root != null) {
            this.inorder(root.left);
            System.out.printf("%s ", root.val);
            this.inorder(root.right);
        }
    }

    // Display postorder traversal from a subtree
    protected void postorder(TreeNode<E> root) {
        if (root != null) {
            this.postorder(root.left);
            this.postorder(root.right);
            System.out.printf("%s ", root.val);
        }
    }

    // Display preorder traversal from a subtree
    protected void preorder(TreeNode<E> root) {
        if (root != null) {
            System.out.printf("%s ", root.val);
            this.preorder(root.left);
            this.preorder(root.right);
        }
    }
}