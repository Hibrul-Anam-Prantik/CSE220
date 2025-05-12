package Heap;

public class MinHeap
{
    int[] heap;
    int size;
    int capacity;

    public MinHeap(int capacity) {
        this.capacity = capacity;
        heap = new int[capacity];
        size = 0;
    }

    // Insert into min Heap
    public void insert(int value) {
        if(size == capacity) throw new IllegalStateException("Heap is full");
        heap[size] = value;
        swin(size++);
    }

    // Swim up -> to maintain heap property
    public void swin(int index) {
        int child = index, parent = (index - 1) / 2;

        while(child > 0 && heap[child] < heap[parent]) {
            swap(child, parent);
            child = parent;
            parent = (child - 1) / 2;
        }
    }

    public int deleteMin() {
        if(size == 0) return Integer.MIN_VALUE;
        int min = heap[0];
        swap(0, size - 1);
        size--;
        sink(size, 1);
        return min;
    }

    public void sink(int size, int i) {
        int left = 2 * i + 1, right = 2 * i + 2, minI = i;
        if(left < size && heap[left] < heap[minI]) minI = left;
        if(right < size && heap[right] < heap[minI]) minI = right;

        if(minI != i) {
            swap(i, minI);
            sink(size, minI);
        }
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
}
