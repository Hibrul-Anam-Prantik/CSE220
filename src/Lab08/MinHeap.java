package Lab08;

import java.util.NoSuchElementException;

// Task#1
public class MinHeap {
    // Tester
    public static void main(String[] args) {
        MinHeap heap = new MinHeap(5);
        heap.insert(3);
        heap.insert(4);
        heap.insert(1);
        heap.insert(2);
        heap.insert(7);
        heap.insert(-1);
//        heap.printHeapArray();
        int x = heap.extractMin();
        System.out.println("*** " + x + " is removed from the Heap ***");
        x = heap.extractMin();
        System.out.println("*** " + x + " is removed from the Heap ***");
        x = heap.extractMin();
        System.out.println("*** " + x + " is removed from the Heap ***");
        x = heap.extractMin();
        System.out.println("*** " + x + " is removed from the Heap ***");
        x = heap.extractMin();
        System.out.println("*** " + x + " is removed from the Heap ***");
        x = heap.extractMin();
//        System.out.println("*** " + x + " is removed from the Heap ***");
        heap.printHeapArray();
    }

    public int[] heap;
    public int size;

    public MinHeap(int capacity) {
        heap = new int[capacity + 1]; // adding 1, as I am using the 1-indexing format
    }

    public void insert(int value) {
        if(size >= heap.length - 1) {
            System.out.println("*** Heap is full!!  Can't insert (" + value + ") ***");
            return;
        }
        heap[++size] = value;  // 1 indexing
        int child = size;
        int parent = child/2;

        while(heap[child] < heap[parent]) {
            swap(child, parent);
            child = parent;
            parent = child/2;
        }
    }

    public int extractMin() {
        if( size == 0) {
            System.out.println("*** Heap is empty!!  Can't extract min ***");
            return Integer.MIN_VALUE;
        }
        int min = heap[1];
        swap(1, size);
        size--;
        heapify(1);
        return min;
    }

    public void swim() {

    }

    public void sink() {

    }

    public void sort() {

    }

    private void swap(int index1, int index2) {
        int temp = heap[index1];
        heap[index1] = heap[index2];
        heap[index2] = temp;
    }

    private void heapify(int i) {
        int left = 2 * i, right = 2 * i + 1, minI = i;
        if(left <= size && heap[left] < heap[minI]) minI = left;
        if(right <= size && heap[right] < heap[minI]) minI = right;

        if(minI != i) {
            swap(i, minI);
            heapify(minI);
        }
    }

    private void printHeapArray() {
        if(size < 1) {
            System.out.println("Heap is empty!!  Can't  print");
            return;
        }
        System.out.println("=====> Printing HeapArray <=====");
        for(int i = 1; i <= size; ++i) {
            System.out.print(heap[i] + " -> ");
        }
        System.out.println("\n<=====> * ===== * <=====>");
    }
}
