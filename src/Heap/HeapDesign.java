package Heap;

import java.util.ArrayList;

public class HeapDesign
{
    public static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            // Add at last Index
            arr.add(data);
             int child = arr.size() - 1;
             int parent = child/2;
             while(arr.get(child) < arr.get(parent)) {
                 swap(arr.get(child), arr.get(parent));
             }
        }
        public void swap(int child, int parent) {
            int temp = child;
            child = parent;
            parent = temp;
        }
    }
}
