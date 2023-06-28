package LabAssessment2;

import java.util.PriorityQueue;

public class TicketSystem {

    public static int[] solution(int[] arr, int k) {

        int[] result = new int[arr.length - k + 1];
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        
        for (int i = 0; i < result.length; i++) {
            pq.clear();
            for (int j = 0; j < k; j++) pq.offer(arr[i + j]);
            result[i] = pq.poll();
        }
        return result;
    }
    
    // Test
    public static void main(String[] args) {
        
        int[] input = {4, 3, 8, 9, 0, 1};
        int[] result = solution(input, 3);
        for (int elem: result) System.out.print(elem + " ");
        System.out.println();
        
        int[] input2 = {9, 8, 6, 4, 3, 1};
        result = solution(input2, 4);
        for (int elem: result) System.out.print(elem + " ");
        System.out.println();
        
        int[] input3 = {1, 2, 3, 4, 10, 6, 9, 8, 7, 5};
        result = solution(input3, 3);
        for (int elem: result) System.out.print(elem + " ");
        System.out.println();
    }
}
