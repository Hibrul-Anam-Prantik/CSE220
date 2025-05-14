package Graph;

public class Graph_ {
    int size;
    int[][] matrix;

    public Graph_(int size) {
        this.size = size;
        matrix = new int[size][size];
    }

    public void addEdge(int src, int dest, int weight) {
        matrix[src][dest] = weight;

    }

    public boolean checkEdge(int src, int dest) {
        return matrix[src][dest] != 0;
    }

    public void dfs(int curr, boolean[] visited) {
        System.out.print(curr + "  ");
        visited[curr] = true;

        
    }

    public void print() {
        System.out.println("Adjacency Matrix:");
        System.out.println("    0 | 1 | 2 | 3 | 4 ");
        System.out.println("    ------------------");
        for(int i = 0; i < size; ++i) {
            System.out.print(i + "|  ");
            for (int j = 0; j < size; ++j) {
                System.out.print(matrix[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph_ graph = new Graph_(5);

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
