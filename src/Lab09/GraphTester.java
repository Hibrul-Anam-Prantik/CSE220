package Lab09;

public class GraphTester
{
    public static void main(String[] args) {
        Task01(new GraphList(7));
        Task01(new GraphMatrix(7));
        Task02(new GraphList(7));
        Task02(new GraphMatrix(7));
        Task03(new GraphList(7));
        Task03(new GraphMatrix(7));
        Task04(new GraphList(7));
        Task04(new GraphMatrix(7));

    /*
        ________________
        |         |    |
        0 -- 1 -- 2 -- 3
         \   |\  /|   /|
          \  | \/ |  / |
           \ | /\ | /  |
            \|/  \|/   |
          -- 4 -- 5 -- 6
         /___| \_______|

     */
    }

    public static void Task01(GraphList g) {
        System.out.println("===================TASK#01====================\n===================AdjList====================");
        makeEmptyGraph(g);
        boolean direction = false;  // unDirected
        // for size 7
        g.addEdge(0, 1, 0, direction);
        g.addEdge(0, 2, 0, direction);
        g.addEdge(0, 3, 0, direction);
        g.addEdge(0, 4, 0, direction);

        g.addEdge(1, 2, 0, direction);
        g.addEdge(1, 4, 0, direction);
        g.addEdge(1, 5, 0, direction);

        g.addEdge(2, 3, 0, direction);
        g.addEdge(2, 4, 0, direction);
        g.addEdge(2, 5, 0, direction);

        g.addEdge(3, 5, 0, direction);
        g.addEdge(3, 6, 0, direction);

        g.addEdge(4, 5, 0, direction);
        g.addEdge(4, 4, 0, direction);
        g.addEdge(4, 6, 0, direction);

        g.addEdge(5, 6, 0, direction);
        System.out.println("The Graph: ");
        g.print();
        System.out.println("The max degree is: " + g.maxDegree());
    }

    public static void Task02(GraphList g) {
        System.out.println("===================TASK#02====================\n===================AdjList====================");
        makeEmptyGraph(g);
        boolean direction = false; // unDirected
        // for size 7
        g.addEdge(0, 1, 7, direction);
        g.addEdge(0, 2, 3, direction);
        g.addEdge(0, 3, 1, direction);
        g.addEdge(0, 4, 2, direction);

        g.addEdge(1, 2, 8, direction);
        g.addEdge(1, 4, 2, direction);
        g.addEdge(1, 5, 3, direction);

        g.addEdge(2, 3, 4, direction);
        g.addEdge(2, 4, 6, direction);
        g.addEdge(2, 5, 2, direction);

        g.addEdge(3, 5, -1, direction);
        g.addEdge(3, 6, 3, direction);

        g.addEdge(4, 5, 4, direction);
        g.addEdge(4, 4, 5, direction);
        g.addEdge(4, 6, 2, direction);

        g.addEdge(5, 6, 7, direction);
        System.out.println("The Graph: ");
        g.print();
        System.out.println("The Maximum Edge Weight is: " + g.maxEdgeWeight());
    }

    public static void Task03(GraphList g) {
        System.out.println("===================TASK#03====================\n===================AdjList====================");
        makeEmptyGraph(g);
        boolean direction = true; // directed
        // for size 7
        g.addEdge(0, 1, 7, direction);
        g.addEdge(0, 2, 3, direction);
        g.addEdge(0, 3, 1, direction);
        g.addEdge(0, 4, 2, direction);

        g.addEdge(1, 2, 8, direction);
        g.addEdge(1, 4, 2, direction);
        g.addEdge(1, 5, 4, direction);

        g.addEdge(2, 3, 4, direction);
        g.addEdge(2, 4, 6, direction);
        g.addEdge(2, 5, 2, direction);

        g.addEdge(3, 5, -1, direction);
        g.addEdge(3, 6, 3, direction);

        g.addEdge(4, 5, 4, direction);
        g.addEdge(4, 4, 5, direction);
        g.addEdge(4, 6, 2, direction);

        g.addEdge(5, 6, 7, direction);
        System.out.println("The Graph: ");
        g.print();
        System.out.println("The max degree is: " + g.maxDegree());
        System.out.println("The Maximum Edge Weight is: " + g.maxEdgeWeight());
    }

    public static void Task04(GraphList g) {
        System.out.println("===================TASK#04====================\n===================AdjList====================");
        makeEmptyGraph(g);
        boolean direction = true; // directed
        // for size 7
        g.addEdge(0, 1, 7, direction);
        g.addEdge(0, 2, 3, direction);
        g.addEdge(0, 3, 1, direction);
        g.addEdge(0, 4, 2, direction);

        g.addEdge(1, 2, 8, direction);
        g.addEdge(1, 4, 2, direction);
        g.addEdge(1, 5, 4, direction);

        g.addEdge(2, 3, 4, direction);
        g.addEdge(2, 4, 6, direction);
        g.addEdge(2, 5, 2, direction);

        g.addEdge(3, 5, -1, direction);
        g.addEdge(3, 6, 3, direction);

        g.addEdge(4, 5, 4, direction);
        g.addEdge(4, 4, 5, direction);
        g.addEdge(4, 6, 2, direction);

        g.addEdge(5, 6, 7, direction);
        System.out.println("The Given Directed Graph: ");
        g.print();
        GraphList updatedGraph = g.directedToUndirected(g);
        System.out.println("The Converted Directed Graph: ");
        updatedGraph.print();
    }

    public static void Task01(GraphMatrix g) {
        System.out.println("\n==================AdjMatrix===================");
        boolean direction = false;
        g.addEdge(0, 1, 1, direction);
        g.addEdge(0, 2, 1, direction);
        g.addEdge(0, 3, 1, direction);
        g.addEdge(0, 4, 1, direction);

        g.addEdge(1, 2, 1, direction);
        g.addEdge(1, 4, 1, direction);
        g.addEdge(1, 5, 1, direction);

        g.addEdge(2, 3, 1, direction);
        g.addEdge(2, 4, 1, direction);
        g.addEdge(2, 5, 1, direction);

        g.addEdge(3, 5, 1, direction);
        g.addEdge(3, 6, 1, direction);

        g.addEdge(4, 5, 1, direction);
        g.addEdge(4, 4, 1, direction);
        g.addEdge(4, 6, 1, direction);

        g.addEdge(5, 6, 1, direction);
        g.print();
        System.out.println("Max degree: " + g.maxDegree());
        System.out.println("\n===================FINISHED===================\n");
    }

    public static void Task02(GraphMatrix g) {
        System.out.println("\n==================AdjMatrix===================");
        boolean direction = false;
        g.addEdge(0, 1, 7, direction);
        g.addEdge(0, 2, 3, direction);
        g.addEdge(0, 3, 1, direction);
        g.addEdge(0, 4, 2, direction);

        g.addEdge(1, 2, 8, direction);
        g.addEdge(1, 4, 2, direction);
        g.addEdge(1, 5, 3, direction);

        g.addEdge(2, 3, 4, direction);
        g.addEdge(2, 4, 6, direction);
        g.addEdge(2, 5, 2, direction);

        g.addEdge(3, 5, -1, direction);
        g.addEdge(3, 6, 3, direction);

        g.addEdge(4, 5, 4, direction);
        g.addEdge(4, 4, 5, direction);
        g.addEdge(4, 6, 2, direction);

        g.addEdge(5, 6, 7, direction);
        g.print();
        System.out.println("Max Edge Weight Sum: " + g.maxEdgeWeight());
        System.out.println("\n===================FINISHED===================\n");
    }

    public static void Task03(GraphMatrix g) {
        System.out.println("\n==================AdjMatrix===================");
        boolean direction = true;
        g.addEdge(0, 1, 7, direction);
        g.addEdge(0, 2, 3, direction);
        g.addEdge(0, 3, 1, direction);
        g.addEdge(0, 4, 2, direction);

        g.addEdge(1, 2, 8, direction);
        g.addEdge(1, 4, 2, direction);
        g.addEdge(1, 5, 4, direction);

        g.addEdge(2, 3, 4, direction);
        g.addEdge(2, 4, 6, direction);
        g.addEdge(2, 5, 2, direction);

        g.addEdge(3, 5, -1, direction);
        g.addEdge(3, 6, 3, direction);

        g.addEdge(4, 5, 4, direction);
        g.addEdge(4, 4, 5, direction);
        g.addEdge(4, 6, 2, direction);

        g.addEdge(5, 6, 7, direction);
        g.print();
        System.out.println("Max degree (outgoing only): " + g.maxDegree());
        System.out.println("Max Edge Weight Sum (outgoing only): " + g.maxEdgeWeight());
        System.out.println("\n===================FINISHED===================\n");
    }

    public static void Task04(GraphMatrix g) {
        System.out.println("\n==================AdjMatrix===================");
        boolean direction = true;
        g.addEdge(0, 1, 7, direction);
        g.addEdge(0, 2, 3, direction);
        g.addEdge(0, 3, 1, direction);
        g.addEdge(0, 4, 2, direction);

        g.addEdge(1, 2, 8, direction);
        g.addEdge(1, 4, 2, direction);
        g.addEdge(1, 5, 4, direction);

        g.addEdge(2, 3, 4, direction);
        g.addEdge(2, 4, 6, direction);
        g.addEdge(2, 5, 2, direction);

        g.addEdge(3, 5, -1, direction);
        g.addEdge(3, 6, 3, direction);

        g.addEdge(4, 5, 4, direction);
        g.addEdge(4, 4, 5, direction);
        g.addEdge(4, 6, 2, direction);

        g.addEdge(5, 6, 7, direction);
        g.print();
        GraphMatrix updatedGraph = g.directedToUndirected(g);
        System.out.println("Converted to Undirected:");
        updatedGraph.print();
        System.out.println("\n===================FINISHED===================\n");
    }

    private static void makeEmptyGraph(GraphList g) {
        for(int i = 0; i < g.size; ++i) {
            g.addNode(new Node(i, 0));
        }
    }
}
