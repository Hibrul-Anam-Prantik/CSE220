package Lab08;
// Task#1
public class MinHeap {
    private int[] heap;
    private int size;

    public MinHeap(int capacity) {
        heap = new int[capacity + 1]; // adding 1, as I am using the 1-indexing format
        size = 0;
    }

    // for task 03
    public int[] getHeap() {
        return heap;
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
//            System.out.println("*** Heap is empty!!  Can't extract min ***");
            return Integer.MIN_VALUE;
        }
        int min = heap[1];
        swap(heap,1, size--);
        heapify(heap, size,1);
//        System.out.println("*** " + min + " is removed from the Heap ***");
        return min;
    }

    public void swim(int i) {
        int child = i;
        int parent = child/2;

        while(parent > 0 && heap[child] < heap[parent]) {
            swap(heap, child, parent);
            child = parent;
            parent = child/2;
        }
    }

    public void sink(int[] heap, int i) {
        int minI = i;
        int left = 2 * i, right = 2 * i + 1;
        if(left <= size && heap[left] < heap[minI]) minI = left;
        if(right <= size && heap[right] < heap[minI]) minI = right;
        if(minI != i) {
            swap(heap, minI, i);
            sink(heap, minI);
        }
    }

    public void sort() {
        int[] tempHeap = new int[size + 1];
        // coping
        for (int i = 1; i <= size; i++) {
            tempHeap[i] = heap[i];
        }
        int tempSize = size;
        for (int i = tempSize / 2; i >= 1; --i) {
            heapify(tempHeap, tempSize, i);
        }
        // sorting
        for (int i = tempSize; i >= 1; --i) {
            swap(tempHeap,1, i);
            tempSize--;
            sink(tempHeap,1);
        }
        System.out.println("*** Heap is Sorted! ***");
        for (int i = size; i > 0; --i) {
            System.out.print(tempHeap[i] + " -> ");
        }
        System.out.println();
    }

    private void swap(int[] heap, int index1, int index2) {
        int temp = heap[index1];
        heap[index1] = heap[index2];
        heap[index2] = temp;
    }

    private void heapify(int[] heap, int size, int i) {
        int left = 2 * i, right = 2 * i + 1, minI = i;
        if(left <= size && heap[left] < heap[minI]) minI = left;
        if(right <= size && heap[right] < heap[minI]) minI = right;

        if(minI != i) {
            int temp = heap[i];
            heap[i] = heap[minI];
            heap[minI] = temp;
            heapify(heap, size, minI);
        }
    }
}
