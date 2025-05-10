package Lab09;

public class GraphMatrix {

    int size;
    int[][] matrix;

    public GraphMatrix(int size) {
        this.size = size;
        matrix = new int[size][size];
    }

    public void addEdge(int src, int dest, int weight, boolean direction) {
        // weight == 0 means no weight(unWeighted)
        matrix[src][dest] = weight;
        if (!direction && src != dest) {  // undirected == false
            matrix[dest][src] = weight;
        }
    }

    // Task#01
    public int maxDegree() {
        int maxD = 0, maxV = 0;
        for (int i = 0; i < size; ++i) {
            int degree = 0;
            for (int j = 0; j < size; ++j) {
                if (matrix[i][j] != 0) degree++;
            }
            if (degree > maxD) {
                maxD = degree;
                maxV = i;
            }
        }
        System.out.println("Vertex \"" + maxV + "\" has Max Degree.");
        return maxD;
    }

    // Task#02
    public int maxEdgeWeight() {
        int maxW = 0, maxV = 0;
        for (int i = 0; i < size; ++i) {
            int weight = 0;
            for (int j = 0; j < size; ++j) {
                weight += matrix[i][j];
            }
            if (weight > maxW) {
                maxW = weight;
                maxV = i;
            }
        }
        System.out.println("Vertex \"" + maxV + "\" has Max Edge Weight.");
        return maxW;
    }

    // Task 4
    public GraphMatrix directedToUndirected(GraphMatrix g) {
        GraphMatrix tempG = new GraphMatrix(g.size);
        for (int i = 0; i < g.size; ++i) {
            for (int j = 0; j < g.size; ++j) {
                if (matrix[i][j] != 0 || matrix[j][i] == 0) {
                    int weight = matrix[i][j];
                    tempG.addEdge(i, j, weight, false);
                } else if( matrix[i][j] == 0 && matrix[j][i] != 0) {
                    int weight = matrix[j][i];
                    tempG.addEdge(j, i, weight, false);
                }
            }
        }
        return tempG;
    }

    public void print() {
        for (int i = 0; i < size; ++i) {
            System.out.print(i + ": ");
            for (int j = 0; j < size; ++j) {
                System.out.print(matrix[i][j] + " | ");
            }
            System.out.println();
        }
    }
}