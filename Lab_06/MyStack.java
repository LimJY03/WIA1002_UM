import java.util.ArrayList;

public class MyStack<E> {

    ArrayList<E> stack;

    // Constructor
    public MyStack() {
        this.stack = new ArrayList<>();
    }

    // Methods
    public void push(E o) { stack.add(o); }
    public E pop() { 
        E o = this.stack.get(this.stack.size() - 1);
        this.stack.remove(this.stack.size() - 1);
        return o;
    }
    public E peek() { return this.stack.get(this.stack.size() - 1); }
    public int getSize() { return this.stack.size(); }
    public boolean isEmpty() { return this.stack.isEmpty(); }
    public String toString() { return this.stack.toString(); }
    public boolean search(E e) { return this.stack.contains(e); }
}