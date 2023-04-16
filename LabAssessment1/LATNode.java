public class LATNode<T> {

    private T value;            // Stores the value of the node
    private String edgeName1;   // Stores the name of second edge of the nod
    private String edgeName2;   // Stores the name of the first edge of the node
    private LATNode<T> edgeNode1;  // Points to the first target node with edgeName1
    private LATNode<T> edgeNode2;  // Points to the second target node with edgeName2

    // Constructor
    public LATNode(T value) {
        this.value = value;
    }

    // Methods
    public void setEdge1(String edgeName, LATNode<T> node) {
        this.edgeName1 = edgeName;
        this.edgeNode1 = node;
    }
    
    public void setEdge2(String edgeName, LATNode<T> node) {
        this.edgeName2 = edgeName;
        this.edgeNode2 = node;
    } 

    public T getValue() {
        return this.value;
    }
    
    public void printEdgesAndNodes() {

        System.out.println("-------------------------------------");
        System.out.println(this.value.toString());
        
        if (edgeNode1 != null) System.out.printf("    :%s->\n        %s\n", this.edgeName1, this.edgeNode1.getValue().toString());
        if (edgeNode2 != null) System.out.printf("    :%s->\n        %s\n", this.edgeName2, this.edgeNode2.getValue().toString());
        System.out.println("-------------------------------------\n");
    }

    public LATNode<T> traverse(String edgeName) {
        if (this.edgeName1 != null && edgeName.equals(this.edgeName1)) return edgeNode1;
        if (this.edgeName2 != null && edgeName.equals(this.edgeName2)) return edgeNode2;
        return null;
    }
}