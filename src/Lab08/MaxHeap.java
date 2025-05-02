package Lab08;
// Task#2
public class MaxHeap {
    private int[] heap;
    private int size;

    public MaxHeap(int capacity) {
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

    public int extractMax() {
        if(size == 0) {
//            System.out.println("\n*** Heap is empty!!  Can't extract max ***");
            return Integer.MAX_VALUE;
        }
        int max = heap[1];
        swap(heap,1, size--);
        heapify(1);
        return max;
    }

    public void swim(int i) {
        int child = i;
        int parent = child/2;

        while(parent > 0 && heap[child] > heap[parent]) {
            swap(heap, child, parent);
            child = parent;
            parent = child/2;
        }
    }

    public void sink(int[] heap, int size, int i) {
        int maxI = i;
        int left = 2 * i, right = 2 * i + 1;
        if(left <= size && heap[left] > heap[maxI]) maxI = left;
        if(right <= size && heap[right] > heap[maxI]) maxI = right;
        if(maxI != i) {
            swap(heap ,maxI, i);
            sink(heap, size, maxI);
        }
    }

    public void sort() {
        int tempSize = size;
        int[] tempHeap = new int[size + 1];
        // coping the heap to the tempHeap
        for(int i = 1; i <= size; i++) {
            tempHeap[i] = heap[i];
        }
        // sorting
        for(int i = tempSize; i > 1; --i) {
            swap(tempHeap,1, i);
            tempSize--;
            sink(tempHeap, tempSize, 1);
        }
        System.out.println("*** Heap is Sorted! ***");
        for(int i = 1; i <= size; i++) {
            System.out.print(tempHeap[i] + " -> ");
        }
        System.out.println();
    }

    private void swap(int[] heap, int index1, int index2) {
        int temp = heap[index1];
        heap[index1] = heap[index2];
        heap[index2] = temp;
    }

    private void heapify(int i) {
        int left = 2 * i, right = 2 * i + 1, maxI = i;
        if(left <= size && heap[left] > heap[maxI]) maxI = left;
        if(right <= size && heap[right] > heap[maxI]) maxI = right;

        if(maxI != i) {
            swap(heap, i, maxI);
            heapify(maxI);
        }
    }
}

