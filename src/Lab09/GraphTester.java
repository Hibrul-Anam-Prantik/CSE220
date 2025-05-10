package Lab09;

public class GraphTester
{
    public static void main(String[] args) {
        Task01(new Graph(7));
        Task02(new Graph(7));
        Task03(new Graph(7));
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

    public static void Task01(Graph g) {
        System.out.println("===================TASK#01====================\n");
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
        System.out.println("\n===================FINISHED===================\n");
    }

    public static void Task02(Graph g) {
        System.out.println("===================TASK#02====================\n");
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
        System.out.println("\n===================FINISHED===================\n");
    }

    public static void Task03(Graph g) {
        System.out.println("===================TASK#03====================\n");
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
        System.out.println("\n===================FINISHED===================\n");
    }

    private static void makeEmptyGraph(Graph g) {
        for(int i = 0; i < g.size; ++i) {
            g.addNode(new Node(i, 0));
        }
    }
}
