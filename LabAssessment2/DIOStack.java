package LabAssessment2;

public class DIOStack<DIO> {

    private DIO[] array = (DIO[]) new Object[1];
    private int size = 0;
    public void push(DIO o) {
        if (size == array.length) this.resize(2 * array.length);
        array[size] = o;
        size++;
    }
    public DIO pop() {
        if (size == 0) return null;
        DIO lastElem = array[size - 1];
        array[size - 1] = null;
        size--;
        return lastElem;
    }
    public DIO peek() {
        return size != 0 ? array[size - 1] : null;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }
    public int size() {
        return this.size;
    }
    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < size; i++) result += this.array[i] + " ";
        return "[" +  result.substring(0, result.length()) + "]";
    }
    private void resize(int size) {
        DIO[] oldArr = this.array;
        this.array = (DIO[]) new Object[size];
        for (int i = 0; i < oldArr.length; i++) this.array[i] = oldArr[i];
    } 
}
