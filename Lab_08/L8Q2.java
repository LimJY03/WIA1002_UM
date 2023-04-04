package Lab_08;

import java.util.Arrays;
import java.util.PriorityQueue;

public class L8Q2 {
    
    public static void main(String[] args) {
        
        PriorityQueue<String> pq1 = new PriorityQueue<>(Arrays.asList(
            "George", "Jim", "John", "Blake", "Kevin", "Michael"
        ));
        PriorityQueue<String> pq2 = new PriorityQueue<>(Arrays.asList(
            "George", "Katie", "Kevin", "Michelle", "Ryan"
        ));

        // Find Union
        PriorityQueue<String> union = new PriorityQueue<>(pq1);
        union.addAll(pq2);
        System.out.println("Union: " + union.toString());

        // Find their difference
        PriorityQueue<String> difference = new PriorityQueue<>(pq1);
        difference.removeAll(pq2);
        System.out.println("Difference: " + difference);

        // Find their intersection
        PriorityQueue<String> intersection = new PriorityQueue<>(pq1);
        intersection.retainAll(pq2);
        System.out.println("Intersection: " + intersection);
    }
}
