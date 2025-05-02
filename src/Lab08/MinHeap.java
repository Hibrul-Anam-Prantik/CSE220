package Lab08;
// Task#1
public class MinHeap {
    private int[] heap;
    private int size;

    public MinHeap(int capacity) {
        heap = new int[capacity + 1]; // adding 1, as I am using the 1-indexing format
        size = 0;
    }

    public void insert(int value) {
        if(size >= heap.length - 1) {
            System.out.println("*** Heap is full!!  Can't insert (" + value + ") ***");
            return;
        }
        heap[++size] = value;  // using the 1-indexing format
        swim(size);
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
        System.out.println("*** " + min + " is removed from the Heap ***");
        return min;
    }

    public void swim(int i) {
        int child = i;
        int parent = child/2;

        while(heap[child] < heap[parent]) {
            swap(child, parent);
            child = parent;
            parent = child/2;
        }
    }

    public void sink(int i) {
        int minI = i;
        int left = 2 * i, right = 2 * i + 1;
        if(left <= size && heap[left] < heap[i]) minI = left;
        if(right <= size && heap[right] < heap[i]) minI = right;
        if(minI != i) {
            swap(minI, i);
            sink(minI);
        }
    }

    public void sort() {
        int tempSize = size;
        for(int i = size; i > 1; --i) {
            swap(1, i);
            size--;
            sink(1);
        }
        size = tempSize;
        System.out.println("*** Heap is Sorted! ***");
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

    public void printHeapArray() {
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

    public void printSortedHeapArray() {
        if(size < 1) {
            System.out.println("Heap is empty!!  Can't  print");
            return;
        }
        System.out.println("=====> Printing Sorted HeapArray <=====");
        for(int i = size; i > 0; --i) {
            System.out.print(heap[i] + " -> ");
        }
        System.out.println("\n<=====> * ===== * <=====>");
    }
}
