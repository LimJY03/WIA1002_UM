package Lab_06_Extra;

public class Solution {

    private Node head;
    private String output = "";

    // Constructor
    public Solution(String list) {

        String[] listVal = list.substring(1, list.length() - 1).split(",");
        boolean toChild = false;

        if (!listVal[0].equals("null")) {

            this.head = new Node(Integer.parseInt(listVal[0]));
            Node current = this.head;

            for (int i = 1; i < listVal.length; i++) {

                if (!listVal[i].equals("null") && !toChild) {

                    current.next = new Node(Integer.parseInt(listVal[i]));
                    
                    current.next.prev = current;
                    current = current.next;
                }
                else if (toChild && !listVal[i].equals("null")) {

                    current.child = new Node(Integer.parseInt(listVal[i]));

                    current = current.child;
                    toChild = false;
                }
                else {
                    current = current.prev;
                    toChild = true;
                }
            }
        }

    }
    
    public static void main(String[] args) {
        
        // Build Graph
        Solution graph = new Solution("[1,2,3,4,5,6,null,null,null,7,8,9,10,null,null,11,12]");

        // Output
        graph.flatten(graph.head);
        System.out.printf("[%s]\n", graph.output.substring(1));
    }    

    // DFS
    public void flatten(Node head) {

        if (head != null) {

            this.output += String.format(",%d", head.val);
            this.flatten(head.child);
            this.flatten(head.next);
        }
    }
}
