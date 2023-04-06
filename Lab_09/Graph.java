public class Graph<T extends Comparable<T>, N extends Comparable<N>> extends WeightedGraph<T, N> {

    Vertex<T, N> head;
    int size = 0;
    
    // Constructor
    public Graph() { head = null; }
    
    // Methods
    public boolean addEdge(T source, T destination) {
        if (head == null) return false;
        if (!super.hasVertex(source) || !super.hasVertex(destination)) return false;
        Vertex<T, N> sourceVertex = head;
        while (sourceVertex != null) {
            if (sourceVertex.vertexInfo.compareTo(source) == 0) {
                // Reached source vertex, look for destination now
                Vertex<T, N> destinationVertex = head;
                while (destinationVertex != null) {
                    if (destinationVertex.vertexInfo.compareTo(destination) == 0) {
                        // Reached destination vertex, add edge here
                        Edge<T, N> currentEdge = sourceVertex.firstEdge;
                        Edge<T, N> newEdge = new Edge<>(destinationVertex, null, currentEdge);
                        sourceVertex.firstEdge = newEdge;
                        sourceVertex.outdeg++;
                        destinationVertex.indeg++;
                        return true;
                    }
                    destinationVertex = destinationVertex.nextVertex;
                }
            }
            sourceVertex = sourceVertex.nextVertex;
        }
        return false;
    }
    public boolean addUndirectedEdge(T v1, T v2) {
        if (this.addEdge(v1, v2)) return this.addEdge(v2, v1);
        return false;
    }
}
