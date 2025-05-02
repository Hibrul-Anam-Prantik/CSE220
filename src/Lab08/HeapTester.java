package Lab08;

public class HeapTester
{
    public static void main(String[] args) {
        // Task#1
        System.out.println("===================TASK#01====================");
        MinHeap heap = new MinHeap(5);
        heap.insert(3);
        heap.insert(4);
        heap.insert(1);
        heap.insert(2);
        heap.insert(7);
        heap.insert(-1);
        System.out.println();
        heap.printHeapArray();
        System.out.println();
        int x = heap.extractMin();
//        System.out.println();
        heap.printHeapArray();
        heap.sort();
        heap.printSortedHeapArray();
        System.out.println();
        x = heap.extractMin();
        heap.printHeapArray();
        heap.sort();
        heap.printSortedHeapArray();
        System.out.println();
        x = heap.extractMin();
        heap.printHeapArray();
        System.out.println();
        x = heap.extractMin();
        heap.printHeapArray();
        System.out.println();
        x = heap.extractMin();
        heap.printHeapArray();
        System.out.println();
        x = heap.extractMin();
        heap.printHeapArray();
        System.out.println("===================FINISHED===================");
        System.out.println("==============================================");
        System.out.println("===================TASK#02====================");
        System.out.println("===================FINISHED===================");
        System.out.println("==============================================");
    }
}
