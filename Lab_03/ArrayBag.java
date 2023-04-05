public class ArrayBag<T> implements BagInterface<T> {
    
    private T[] bag;
    private static final int DEFAULT_CAPACITY = 25;
    private int numberOfEntries;

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

        T elem = this.bag[this.getCurrentSize() - 1];
        this.bag[this.getCurrentSize() - 1] = null;
        this.numberOfEntries--;

        return elem;
    }
    public boolean remove(T anEntry) { 

        // Linear Search
        for (int i = 0; i < this.getCurrentSize(); i++) {
            if (this.bag[i] == anEntry) {
                this.numberOfEntries--;
                this.bag[i] = this.bag[this.getCurrentSize() - 1];
                this.bag[this.getCurrentSize() - 1] = null;
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
    public BagInterface<T> union(BagInterface<T> bag) {
        
        ArrayBag<T> newBag = new ArrayBag<>(this.bag.length + bag.toArray().length);
        
        for (int i = 0; i < this.getCurrentSize(); i++) newBag.add(this.bag[i]);

        T[] bag2 = bag.toArray();

        for (int i = 0; i < bag.getCurrentSize(); i++) newBag.add(bag2[i]);

        return newBag;
    }
    public BagInterface<T> intersect(BagInterface<T> bag) {

        ArrayBag<T> newBag;
        T[] bagArr = bag.toArray();

        if (this.getCurrentSize() <= bag.getCurrentSize()) {

            newBag = new ArrayBag<>(this.getCurrentSize());
            
            for (int i = 0; i < this.getCurrentSize(); i++) {

                if (newBag.contains(this.bag[i])) continue;

                int lowerFreq = Math.min(this.getFrequencyOf(this.bag[i]), bag.getFrequencyOf(this.bag[i]));

                for (int j = 0; j < lowerFreq; j++) newBag.add(this.bag[i]);
            }
        }
        else {

            newBag = new ArrayBag<>(bag.getCurrentSize());
            
            for (int i = 0; i < bag.getCurrentSize(); i++) {

                if (newBag.contains(bagArr[i])) continue;

                int lowerFreq = Math.min(this.getFrequencyOf(bagArr[i]), bag.getFrequencyOf(bagArr[i]));

                for (int j = 0; j < lowerFreq; j++) newBag.add(bagArr[i]);
            }
        }

        return newBag;
    }
    public BagInterface<T> difference(BagInterface<T> bag) {

        ArrayBag<T> newBag = new ArrayBag<>(this.getCurrentSize());

        // Copy
        for (int i = 0; i < this.getCurrentSize(); i++) newBag.add(this.bag[i]);

        T[] bagArr = bag.toArray();

        for (int i = 0; i < bag.getCurrentSize(); i++) if (newBag.contains(bagArr[i])) newBag.remove(bagArr[i]);

        return newBag;
    }
}