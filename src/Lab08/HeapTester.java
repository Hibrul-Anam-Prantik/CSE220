package Lab08;

public class HeapTester
{
    public static void main(String[] args) {
        // TASK#01
        System.out.println("===================TASK#01====================");
        MinHeap minHeap = new MinHeap(5);
        int[] elems = {30, 40, 10, 20, 70, -10};
        insert(minHeap, elems);
        System.out.println();
        printHeapArray(minHeap);
        System.out.println();
        elems = new int[]{30, 40, 10, 20, 70};
        insert(minHeap, elems);
        System.out.println(minHeap.extractMin() + " is extracted.");
        printHeapArray(minHeap);
        System.out.println();
        elems = new int[]{30, 40, 10, 20, 70, -10};
        insert(minHeap, elems);
        int[] sorted = minHeap.sort();
        System.out.println("Sorted!");
        printSortedArray(sorted);
        printHeapArray(minHeap);
        System.out.println();
        System.out.println("===================FINISHED===================");
        System.out.println("==============================================");
        // TASK#02
        System.out.println("===================TASK#02====================");
        MaxHeap maxHeap = new MaxHeap(5);
        elems = new int[]{3, 4, 1, 2, 7, -1};
        insert(maxHeap, elems);
        System.out.println();
        printHeapArray(maxHeap);
        System.out.println();
        elems = new int[]{3, 4, 1, 2, 7, -1};
        insert(maxHeap, elems);
        System.out.println(maxHeap.extractMax() + " is extracted.");
        printHeapArray(maxHeap);
        System.out.println();
        elems = new int[]{3, 4, 1, 2, 7, -1};
        insert(maxHeap, elems);
        maxHeap.sort();
        printHeapArray(maxHeap);
        System.out.println();
        System.out.println("===================FINISHED===================");
        System.out.println("==============================================");
    }
    public static void insert(MaxHeap heap, int[] arr) {
        for(int x: arr)
            heap.insert(x);
    }

    public static void insert(MinHeap heap, int[] arr) {
        for(int x: arr)
            heap.insert(x);
    }

    public static void printHeapArray(MaxHeap heap) {
        System.out.println("=====> Printing HeapArray <=====");
        int elem = heap.extractMax();
        while(elem != Integer.MAX_VALUE) {
            System.out.print(elem + " -> ");
            elem = heap.extractMax();
        }
        System.out.println("\n<=====> * ===== * <=====>");
    }

    public static void printHeapArray(MinHeap heap) {
        System.out.println("=====> Printing HeapArray <=====");
        int elem = heap.extractMin();
        while(elem != Integer.MIN_VALUE) {
            System.out.print(elem + " -> ");
            elem = heap.extractMin();
        }
        System.out.println("\n<=====> * ===== * <=====>");
    }

    public static void printSortedArray(int[] arr){
        System.out.println("=====> Printing SortedArray <=====");
        for(int i = arr.length - 1; i > 0; --i)
            System.out.print(arr[i] + " -> ");
        System.out.println("\n<=====> * ===== * <=====>");
    }
}
