package Lab_08_Extra;

import java.util.PriorityQueue;

class Score {
    
    public String[] findRelativeRanks(int[] score) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> score[b] - score[a]);
        String[] output = new String[score.length];
        int rank = 1;

        // Add index
        for (int i = 0; i < score.length; i++) pq.add(i);

        while (!pq.isEmpty()) {
            
            int i = pq.poll();
            
            if (rank == 1) output[i] = "Gold Medal";
            else if (rank == 2) output[i] = "Silver Medal";
            else if (rank == 3) output[i] = "Bronze Medal";
            else output[i] = "" + rank;
            
            rank++;
        }

        return output;
    } 

    public static void main(String[] args) {

        int[] score = {5, 2, 3, 10, 7, 1};
        String[] result = new Score().findRelativeRanks(score);
        for (String s: result) System.out.printf("%s ", s);
    }
}