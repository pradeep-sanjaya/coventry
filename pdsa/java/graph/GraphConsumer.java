package pdsa.graph;

public class GraphConsumer {
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        print(graph);
    }

    public static void print(Graph graph) {
        int cou;

        LinkedList<Integer> list[] = graph.getEdges();

        for (cou = 0 ; cou < graph.getNoOfVertices() ; cou++) {
            System.out.print(cou + " -> ");
            for (Integer edge: list[cou]) {
                System.out.print(edge + " ");
            }
            System.out.println("");
        }
    }
}
