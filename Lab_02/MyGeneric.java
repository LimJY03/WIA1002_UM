public class MyGeneric<E> {
    
    private E e;
    
    public MyGeneric() {
        // no-arg constructor
    }
    
    public MyGeneric(E e) {
        this.e = e;
    }
    
    public void setE(E e) {
        this.e = e;
    }
    
    public E getE() {
        return e;
    }
}

class L2Q2Test {
    public static void main(String[] args) {
        MyGeneric<String> strObj = new MyGeneric<>("Hello");
        MyGeneric<Integer> intObj = new MyGeneric<>(42);
        
        System.out.println(strObj.getE());
        System.out.println(intObj.getE()); 
    }
}
