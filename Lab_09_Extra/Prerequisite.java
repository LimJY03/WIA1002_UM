package Lab_09_Extra;

import java.util.*;

public class Prerequisite {
    
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        List<Integer>[] graph = new ArrayList[numCourses];

        // Build graph
        for (int i = 0; i < numCourses; i++) graph[i] = new ArrayList<>();
        for (int[] preq: prerequisites) graph[preq[0]].add(preq[1]);
        
        ArrayList<Integer> visited = new ArrayList<>();

        // Check cycle
        for (int i = 0; i < numCourses; i++) {
            if (visited.contains(i)) return false;
            visited.add(i);
            for (int course: graph[i]) {
                if (visited.contains(course)) return false;
                visited.add(course);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] prerequisites = {{1, 0}, {2, 1}, {3, 2}, {1, 3}};
        System.out.println(new Prerequisite().canFinish(4, prerequisites));
    }
}