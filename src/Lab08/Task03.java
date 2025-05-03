package Lab08;

public class Task03 {
    public static void main(String[] args) {
        int[] tasks = {2, 4, 7, 1, 6};
        int m = 4;
        MinHeap loads = new MinHeap(m);
        // filling the heap with 0
        for(int i = 0; i < m; ++i) {
            loads.insert(0);
        }
        // loading the machines
        for(int i = 0; i < tasks.length; ++i) {
            int load = loads.extractMin();  // extracting the smallest load
            load += tasks[i]; // adding the task's processing time to this load
            loads.insert(load); // reInserting the updated load
        }
        int[] machines = loads.sort(); // sorting the heap for printing output

        System.out.print("[");  // for the printing format
        for(int i = 1; i <= m; ++i) {
            if(i == m) System.out.println(machines[i] + "]"); // for the printing format
            else System.out.print(machines[i] + ", ");
        }
    }
}
