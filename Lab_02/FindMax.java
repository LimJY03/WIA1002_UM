public class FindMax {
    
    public static void main(String[] args) {
        
        Integer[] arr1 = {1, 2, 3};
        String[] arr2 = {"red", "green", "blue"};
        Circle[] arr3 = {new Circle(3), new Circle(2.9), new Circle(5.9)};

        System.out.printf("Max in arr1: %s\n", max(arr1));
        System.out.printf("Max in arr2: %s\n", max(arr2));
        System.out.printf("Max in arr3: %s\n", max(arr3));
    }

    public static <E extends Comparable<E>> E max(E[] list) {
        E result = list[0];
        for (E elem: list) if (elem.compareTo(result) > 0) result = elem;
        return result;
    }
}

class Circle implements Comparable<Circle> {

    private double radius;

    // Constructor
    public Circle(double radius) { this.radius = radius; }

    // Overriden Methods
    @Override
    public int compareTo(Circle obj) {
        if (this.radius > obj.radius) return 1;
        else if (this.radius < obj.radius) return -1;
        return 0;
    }
    @Override
    public String toString() {
        return "Circle of radius " + this.radius;
    }
}
