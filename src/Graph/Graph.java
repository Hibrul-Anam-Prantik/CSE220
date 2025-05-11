package Graph;

public class Graph
{
    int size;
    Node[] adjList;
    int count = 0;

    public Graph(int size) {
        this.size = size;
        adjList = new Node[size];
    }

    public void addNode(Node node) {
        if(count < size) adjList[count++] = node;
    }

    public void addEdge(int src, int dest, int weight) {
        Node destNode = new Node(dest);  // destination node
        destNode.weight = weight; // adding weight
        destNode.next = adjList[src].next; // connecting to current the neighbor
        adjList[src].next = destNode;  // src -> dest
    }

    public boolean checkEdge(int src, int dest) {
        Node curr = adjList[src].next;

        while(curr != null) {
            if (curr.vertex == dest) return true;
            curr = curr.next;
        }
        return false;
    }

    public void print() {
        System.out.println("Adjacency List: ");
        for(int i = 0; i < count; ++i) {
            Node curr = adjList[i].next;
//            System.out.print(adjList[i].vertex + " ----> ");
            while(curr != null) {
                System.out.print(adjList[i].vertex);
                System.out.print(" ----> " + curr.vertex + " (" + curr.weight + ") , ");
                curr = curr.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(5);

        graph.addNode(new Node(0));
        graph.addNode(new Node(1));
        graph.addNode(new Node(2));
        graph.addNode(new Node(3));
        graph.addNode(new Node(4));

        graph.addEdge(1, 2, 3);
        graph.addEdge(1, 4, 2);
        graph.addEdge(1, 0, 5);

        graph.addEdge(2, 0, 1);
        graph.addEdge(2, 4, 7);

        graph.addEdge(3, 1, 3);
        graph.addEdge(3, 2, 2);
        graph.addEdge(3, 4, 4);

        graph.addEdge(4, 1, 1);

        graph.print();
    }
}

// node for the connections
class Node {
    int vertex, weight;
    Node next;

    Node(int v) {
        vertex = v;
        next = null;
    }
}
