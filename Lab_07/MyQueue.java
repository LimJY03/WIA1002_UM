package Lab_07;

import java.util.LinkedList;

public class MyQueue<E> {

    private LinkedList<E> queue = new LinkedList<>();
    
    // Constructor
    public MyQueue() {}
    public MyQueue(E[] e) { for (E el: e) this.queue.addLast(el); }

    // Methods
    public void enqueue(E e) { this.queue.addLast(e); }
    public E dequeue() { return this.queue.removeFirst(); }
    public E getElement(int i) { return this.queue.get(i); }
    public E peek() { return this.queue.getFirst(); }
    public int getSize() { return this.queue.size(); }
    public boolean contains(E e) { return this.queue.contains(e); }
    public boolean isEmpty() { return this.queue.isEmpty(); }
    public String toString() { return queue.toString(); }
}
