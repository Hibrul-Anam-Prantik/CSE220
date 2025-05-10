package Lab09;

public class GraphList
{
    int size;
    Node[] adjList;
    int count = 0;

    public GraphList(int size) {
        this.size = size;
        adjList = new Node[size];
    }

    public void addNode(Node node) {
        if(count < size) adjList[count++] = node;
    }

    public void addEdge(int src, int dest, int weight, boolean direction) {
        // weight == 0 means no weight(unWeighted)
        Node destNode = new Node(dest, weight);
        destNode.next = adjList[src].next;
        adjList[src].next = destNode;

        if(!direction && src != dest) {  // undirected == false
            Node srcNode = new Node(src, weight);
            srcNode.next = adjList[dest].next;
            adjList[dest].next = srcNode;
        }
    }

    // Task#01
    public int maxDegree() {
        int maxD = 0, maxV = adjList[0].data;
        for(int i = 0; i < count; i++) {
            int degree = countEdges(adjList[i]);
            if(degree > maxD) {
                maxD = degree;
                maxV = adjList[i].data;
            }
        }
        System.out.println("Vertex \"" + maxV + "\" has Max Degree.");
        return maxD;
    }

    // Task#02
    public int maxEdgeWeight() {
        int maxW = 0, maxV = adjList[0].data;
        for(int i = 0; i < count; i++) {
            int weight = sumEdgeWeight(adjList[i]);
            if(weight > maxW) {
                maxW = weight;
                maxV = adjList[i].data;
            }
        }
        System.out.println("Vertex \"" + maxV + "\" has Max Edge Weight.");
        return maxW;
    }

    // Task#04
    public GraphList directedToUndirected(GraphList g) {
        // to avoid creating duplicate reverse edges, I am using a copy of the directedGraph
        GraphList tempG = new GraphList(g.size);
        for(int i = 0; i < g.count; ++i) {
            tempG.addNode(new Node(g.adjList[i].data, 0)); // empty nodes
        }

        for(int i = 0; i < g.count; ++i) {
            Node curr = g.adjList[i].next;
            while(curr != null) {
                int src = i;
                int dest = curr.data;
                int weight = curr.weight;
                /* If there's no connection between the Source and the Destination,
                    I will make a connection between them (following, direction = false; unDirected),
                    and add the weights.
                 */
                if (!checkEdge(tempG, dest, src)) {
                    tempG.addEdge(src, dest, weight, false);
                }
                // using false in the direction parameter will make the graph undirected by adding the edges in both directions.
                curr = curr.next;
            }
        }
        return tempG;
    }

    private int sumEdgeWeight(Node node) {
        int weight = 0;
        Node curr = node.next;
        while(curr != null) {
            weight += curr.weight;
            curr = curr.next;
        }
        return weight;
    }
    private int countEdges(Node node) {
        int count = 0;
        Node curr = node.next;
        while(curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }

    public void print() {
        for(int i = 0; i < count; ++i) {
            System.out.print(adjList[i].data + " : ");
            Node curr = adjList[i].next;
            while(curr != null) {
                System.out.print(curr.data + " -(" + curr.weight + ")-> ");
                curr = curr.next;
            }
            System.out.println();
        }
    }

    private boolean checkEdge(GraphList g, int src, int dest) {
        Node curr = g.adjList[src].next;
        while (curr != null) {
            if (curr.data == dest) return true; // edge
            curr = curr.next;
        }
        return false; // no edge
    }
}

class Node {
    int data; // vertices
    int weight;  // for unWeighted I will use "0" as the weight
    Node next;

    Node(int data, int weight) {
        this.data = data;
        this.weight = weight;
        this.next = null;
    }
}