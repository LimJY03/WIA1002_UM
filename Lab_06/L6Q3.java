public class L6Q3 {

    public int reduce(MyStack<Integer> S) {

        if (S.isEmpty()) return 0;

        int sum = S.pop();
        
        while (!S.isEmpty()) sum += S.pop();

        return sum;
    }
}