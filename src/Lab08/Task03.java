package Lab08;

public class Task03 {
    public static void main(String[] args) {
        int[] tasks = {2, 4, 7, 1, 6};
        int m = 4;
        MinHeap loads = new MinHeap(m);
        for(int i = 0; i < tasks.length; ++i){
            if(i != tasks.length - 1 && loads.getHeap()[i + 1] == 0) {
                loads.insert(tasks[i]);
            } else {
                int add = loads.extractMin();
                loads.insert(add + tasks[i]);
            }
        }
        System.out.print("[");  // for the printing format
        for(int i = 1; i <= m; ++i) {
            if(i == m) System.out.println(loads.getHeap()[i] + "]"); // for the printing format
            else System.out.print(loads.getHeap()[i] + ", ");
        }
    }
}
