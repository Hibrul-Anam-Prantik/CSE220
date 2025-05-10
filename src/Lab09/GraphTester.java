package Lab09;

public class GraphTester
{
    public static void main(String[] args) {
        Graph g = new Graph(7);
        makeEmptyGraph(g);

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
        // for size 7
        g.addEdge(0, 1, 0, true);
        g.addEdge(0, 2, 0, true);
        g.addEdge(0, 3, 0, true);
        g.addEdge(0, 4, 0, true);

        g.addEdge(1, 2, 0, true);
        g.addEdge(1, 4, 0, true);
        g.addEdge(1, 5, 0, true);

        g.addEdge(2, 3, 0, true);
        g.addEdge(2, 4, 0, true);
        g.addEdge(2, 5, 0, true);

        g.addEdge(3, 5, 0, true);
        g.addEdge(3, 6, 0, true);

        g.addEdge(4, 5, 0, true);
        g.addEdge(4, 4, 0, true);
        g.addEdge(4, 6, 0, true);

        g.addEdge(5, 6, 0, true);

        // Task#01
        System.out.println("===================TASK#02====================\n");
        System.out.println("The max degree is: " + g.maxDegree());
        System.out.println("\n===================FINISHED===================\n");
    }

    public static void makeEmptyGraph(Graph g) {
        for(int i = 0; i < g.size; ++i) {
            g.addNode(new Node(i));
        }
    }
}
