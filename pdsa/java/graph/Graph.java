/*
Coventry Computing 18.2
Pradeep Sanjaya
cobsccomp182p-030

Programming, Data Structures and Algorithms
Assignment 30
Java HashMap
*/

package pdsa.graph;

public class Graph {
    private int noOfVertices;
    private LinkedList<Integer> edges[];

    public int getNoOfVertices() {
        return noOfVertices;
    }

    public LinkedList<Integer>[] getEdges() {
        return edges;
    }

    public Graph(int noOfVertices) {
        this.noOfVertices = noOfVertices;
        edges = new LinkedList[this.noOfVertices];

        int cou;
        for (cou = 0; cou < this.noOfVertices ; cou++) {
            edges[cou] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination) {
        this.edges[source].addFirst(destination);
        this.edges[destination].addFirst(source);
    }
}