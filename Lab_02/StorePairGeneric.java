public class StorePairGeneric<T extends Comparable<T>> implements Comparable<StorePairGeneric<T>> {

    private T first, second;

    // Constructor
    public StorePairGeneric(T first, T second) {
        this.first = first;
        this.second = second;
    }

    // Methods
    public T getFirst() { return first; }
    public T getSecond() { return second; }
    public void setPair(T first, T second) {
        this.first = first;
        this.second = second;
    }
    public String toString() { return "first = " + first + " second = " + second; }

    // Overriden Methods
    @Override
    public boolean equals(Object obj) { 
        return this.first.equals(((StorePairGeneric<T>) obj).getFirst());
    }
    @Override
    public int compareTo(StorePairGeneric<T> t) {
        return this.first.compareTo(t.getFirst());
    }
}

class L2Q3Test {

    public static void main(String[] args) {
        
        StorePairGeneric<Integer> a = new StorePairGeneric<>(6, 4);
        StorePairGeneric<Integer> b = new StorePairGeneric<>(2, 2);
        StorePairGeneric<Integer> c = new StorePairGeneric<>(6, 3);
        
        System.out.println("a: " + a.toString());
        System.out.println("b: " + b.toString());
        System.out.println("c: " + c.toString());
        
        // Compare first values using equals() method
        System.out.println("a equals b? " + a.equals(b));
        System.out.println("a equals c? " + a.equals(c));
        
        // Compare first values using compareTo() method
        System.out.println("a compareTo b: " + a.compareTo(b));
        System.out.println("a compareTo c: " + a.compareTo(c));
    }
}