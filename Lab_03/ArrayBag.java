public class ArrayBag<T> implements BagInterface<T> {

    T[] bag;
    static final int DEFAULT_CAPACITY = 25;
    int numberOfEntries;

    // Constructor
    public ArrayBag() {
        this(DEFAULT_CAPACITY);
    }
    public ArrayBag(int size) {
        this.bag = (T[]) new Object[size];
    }

    // Methods
    public int getCurrentSize() { return this.numberOfEntries; }
    public boolean isFull() { return this.getCurrentSize() == this.bag.length; }
    public boolean isEmpty() { return this.getCurrentSize() == 0; }
    public boolean add(T newEntry) { 

        if (this.isFull()) return false;

        this.bag[this.getCurrentSize()] = newEntry; 
        this.numberOfEntries++;

        return true;
    }
    public T remove() {

        if (this.isEmpty()) return null;

        T elem = this.bag[this.getCurrentSize()];
        this.bag[this.getCurrentSize()] = null;
        this.numberOfEntries--;

        return elem;
    }
    public boolean remove(T anEntry) { 

        // Linear Search
        for (int i = 0; i < this.getCurrentSize(); i++) {
            if (this.bag[i] == anEntry) {
                this.numberOfEntries--;
                this.bag[i] = this.bag[this.getCurrentSize()];
                return true;
            }
        }

        return false;
    }
    public void clear() { 
        this.bag = (T[]) new Object[this.bag.length]; 
        this.numberOfEntries = 0;
    }
    public int getFrequencyOf(T anEntry) {

        int freq = 0;

        // Linear Search
        for (int i = 0; i < this.getCurrentSize(); i++) if (this.bag[i] == anEntry) freq++;

        return freq;
    }
    public boolean contains(T anEntry) {
        for (int i = 0; i < this.getCurrentSize(); i++) if (this.bag[i] == anEntry) return true;
        return false;
    }
    public T[] toArray() { return this.bag; }
}