package Lab_08;

import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Arrays;

public class L8Q1 {
    
    public static void main(String[] args) {
        
        Integer[] arr = {4, 8, 1, 2, 9, 6, 3, 7};
        PriorityQueue<Integer> pq = new PriorityQueue<>(Arrays.asList(arr));

        // Displaying all the elements in the priority queue z
        System.out.println("Elements in the priority queue: " + pq.toString());

        // Retrieving and removing the first element in the priority queue
        System.out.println("First element retrieved and removed: " + pq.poll());

        // Adding new element 5 into the priority queue
        pq.add(5);
        System.out.println("Element 5 added to the priority queue");

        // Converting the priority queue into an array and displaying
        System.out.println("Priority queue converted to an array: " + Arrays.toString(pq.toArray()));

        // Retrieving the first element in the priority queue
        System.out.println("First element retrieved (without removing): " + pq.peek());

        // Checking if the priority queue consists of element "1"
        System.out.println("Priority queue contains element \"1\": " + pq.contains(1));

        // Getting the current size of the priority queue
        System.out.println("Current size of the priority queue: " + pq.size());

        // Displaying and removing all elements in the priority queue
        System.out.println("Removing elements from the priority queue:");
        while (!pq.isEmpty()) System.out.println(pq.poll());

        // Sorting the priority queue in reverse order
        PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>(Collections.reverseOrder());
        for (int num: arr) pq2.add(num);
        System.out.println("Priority queue sorted in reverse order: " + pq2.toString());
    }
}