public class MinMaxTwoDArray {

    public static <E extends Comparable<E>> E min(E[][] list) {
        E result = list[0][0];
        for (E[] row: list) for (E elem: row) if (elem.compareTo(result) < 0) result = elem;
        return result;
    }
    public static <E extends Comparable<E>> E max(E[][] list) {
        E result = list[0][0];
        for (E[] row: list) for (E elem: row) if (elem.compareTo(result) > 0) result = elem;
        return result;
    }
}

class L2Q6Test {

    public static void main(String[] args) {
        Integer[][] numbers = {{4, 5, 6}, {1, 2, 3}};
        System.out.printf("Minimum element in numbers: %s\n", MinMaxTwoDArray.<Integer>min(numbers));
        System.out.printf("Maximum element in numbers: %s\n", MinMaxTwoDArray.<Integer>max(numbers));
    }
}