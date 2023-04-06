public class TestGraph {
    
    public static void main(String[] args) {

        Graph<String, Integer> graph = new Graph<>();

        String[] cities = { "Alor Setar", "Kuching", "Langkawi", "Melaka", "Penang", "Tawau" };
        for (String i: cities) graph.addVertex(i);

        System.out.println("The number of vertices in graph: " + graph.getSize());

        System.out.println("Cities and their vertices ");
        for (int i = 0; i <= graph.getSize() - 1; i++)
            System.out.print(i + ": " + graph.getVertex(i) + "\t");
        System.out.println();

        System.out.println("Is Melaka in the Graph? " + graph.hasVertex("Melaka"));
        System.out.println("Is Ipoh in the Graph? " + graph.hasVertex("Ipoh"));
        System.out.println();

        System.out.println("Kuching at index:  " + graph.getIndex("Kuching"));
        System.out.println("Ipoh at index:  " + graph.getIndex("Ipoh"));
        System.out.println();

        System.out.println("add edge Kuching - Melaka: " + graph.addEdge("Kuching", "Melaka"));
        System.out.println("add edge Langkawi - Penang : " + graph.addEdge("Langkawi", "Penang"));
        System.out.println("add edge Melaka - Penang : " + graph.addEdge("Melaka", "Penang"));
        System.out.println("add edge Alor Setar - Kuching : " + graph.addEdge("Alor Setar", "Kuching"));
        System.out.println("add edge Tawau - Alor Setar : " + graph.addEdge("Tawau", "Alor Setar"));
        System.out.println("add edge Kuching - Tawau : " + graph.addEdge("Kuching", "Tawau"));
        System.out.println("add edge Langkawi - Ipoh : " + graph.addEdge("Langkawi", "Ipoh"));
        System.out.println();

        System.out.println("has edge from Kuching to Melaka?  " + graph.hasEdge("Kuching", "Melaka"));
        System.out.println("has edge from Melaka to Langkawi?  " + graph.hasEdge("Melaka", "Kuching"));
        System.out.println("has edge from Ipoh to Langkawi?  " + graph.hasEdge("Ipoh", "Langkawi"));
        System.out.println();

        System.out.println("weight of edge from Kuching to Melaka?  " + graph.getEdgeWeight("Kuching", "Melaka"));
        System.out.println("weight of edge from Tawau to Alor Setar?  " + graph.getEdgeWeight("Tawau", "Alor Setar"));
        System.out.println("weight of edge from Semporna to Ipoh?  " + graph.getEdgeWeight("Semporna", "Ipoh"));
        System.out.println();

        System.out.println("In and out degree for Kuching is " + graph.getIndeg("Kuching") + " and "
                + graph.getOutdeg("Kuching"));
        System.out.println(
                "In and out degree for Penang is " + graph.getIndeg("Penang") + " and " + graph.getOutdeg("Penang"));
        System.out.println(
                "In and out degree for Ipoh is " + graph.getIndeg("Ipoh") + " and " + graph.getOutdeg("Ipoh"));
        System.out.println();

        System.out.println("Neighbours of Kuching : " + graph.getNeighbours("Kuching"));
        System.out.println("\nPrint Edges : ");
        graph.printEdges();

    }
}
