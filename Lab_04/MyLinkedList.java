public class MyLinkedList<E> {
    
    private Node<E> head;
    private Node<E> tail;
    private int size = 0;

    // Constructor
    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Methods
    public void addFirst(E e) {
        
        Node<E> firstNode = new Node<>(e);
        firstNode.next = this.head;
        this.head = firstNode;

        if (this.tail == null) this.tail = this.head;

        this.size++;
    }
    public void addLast(E e) {

        Node<E> lastNode = new Node<>(e);

        if (this.tail == null) {
            head = tail = lastNode;
        }
        else {
            this.tail.next = lastNode;
            this.tail = lastNode;
        }

        this.size++;
    }
    public void add(int index, E e) {

        if (index >= this.size) this.addLast(e);
        else if (index <= 0) this.addFirst(e);
        else {
            
            Node<E> newNode = new Node<>(e);
            Node<E> current = this.head;

            for (int i = 0; i < index - 1; i++) current = current.next;
            
            newNode.next = current.next;
            current.next = newNode;
        }

        this.size++;
    }
    public E removeFirst() {

        if (this.size == 0) return null;

        E elem = this.head.element;
        this.head = this.head.next;
        this.size--;
        
        if (this.head == null) this.tail = null;
        
        return elem;
    }
    public E removeLast() {
        
        if (this.size == 0) return null;
        else if (this.size == 1) {
            E elem = this.head.element;
            this.head = this.tail = null;
            this.size--;
            return elem;
        }
        else {

            Node<E> current = this.head;

            for (int i = 0; i < this.size - 1; i++) current = current.next;

            E elem = this.tail.element;
            current.next = null;
            this.tail = current;

            this.size--;

            return elem;
        }
    }
    public E remove(int index) {

        if (index >= this.size) return this.removeLast();
        else if (index <= 0) return this.removeFirst();
        else {
            
            Node<E> current = this.head;

            for (int i = 0; i < index - 1; i++) current = current.next;

            E elem = current.next.element;
            current.next = current.next.next;

            this.size--;

            return elem;
        }
    }
    public boolean contains(E e) { return this.indexOf(e) >= 0; }
    public E get(int index) {
        Node<E> current = this.head;
        if (index < 0 || index >= this.size) return null;
        for (int i = 0; i < index; i++) current = current.next;
        return current.element;
    }
    public E getFirst() { return this.head.element; }
    public E getLast() { return this.tail.element; }
    public int indexOf(E e) {
        
        Node<E> current = this.head;
        int index = 0;

        while (current != null) {
            if (current.element == e) return index;
            current = current.next;
            index++;
        }

        return -1;
    }
    public int lastIndexOf(E e) {
        
        Node<E> current = this.head;
        boolean hasFound = false;
        int index = 0, lastIndex = 0;

        while (current != null) {
            if (current.element == e) {
                lastIndex = index;
                hasFound = true;
            }
            current = current.next;
            index++;
        }

        return hasFound ? lastIndex : -1;
    }
    public void set(int index, E e) {
        Node<E> current = this.head;
        if (index < 0 || index >= this.size) throw new IndexOutOfBoundsException("Invalid index" + index);
        for (int i = 0; i < index; i++) current = current.next;
        current.element = e;
    }
    public void clear() { this.head = this.tail = null; }
    public void print() {
        Node<E> current = this.head;
        while (current != null) {
            System.out.printf("%s ", current.element.toString());
            current = current.next;
        }
        System.out.println();
    }
    public void reverse() {
        this.dfs(this.head);
        System.out.println();
    }
    private void dfs(Node<E> node) { 
        if (node == null) return;
        this.dfs(node.next);
        System.out.printf("%s ", node.element.toString());
    }
    public E getMiddleValue() {
        Node<E> current = this.head;
        for (int i = 0; i < (this.size + 1) / 2; i++) current = current.next;
        return current.element;
    }
}