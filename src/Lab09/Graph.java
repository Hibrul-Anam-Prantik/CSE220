package Lab09;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph
{
    int size;
    LinkedList<Integer> adjList = new LinkedList<>();
    // size = number of nodes
    public Graph(int size) {
        this.size = size;
    }
    
    public void addEdge() {
        Edge elem1 = new Edge(0, 1, 1);
        elem1.next = adjList.get(0);
    }
    
}
// Adjacency 
class Edge {
    public Integer next;

    Edge (int source, int destination, int weight) {
        
    }
}
