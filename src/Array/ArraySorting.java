package Array;

import java.util.Scanner;
import java.util.Arrays;

public class ArraySorting
{
    public int[] arr;
    int length;
    Scanner sc = new Scanner(System.in);
    public ArraySorting()
    {
        System.out.print("Enter the size of the array.\n=> ");
        length = sc.nextInt();
        for(int i = 0; i < length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
    }

    public ArraySorting(int[] arr) {
        this.arr = arr;
        length = arr.length;
    }
}

class BubbleSort extends ArraySorting
{
    public BubbleSort() {}

    public BubbleSort(int[] arr) {
        super(arr);
    }

    public void bubbleSort() {
        for(int turn = 0; turn < length - 1; turn ++) {
            for(int i = 0; i < length - 1 - turn;i++) {
                if(arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}

class InsertionSort extends ArraySorting {
    public InsertionSort() {}

    public InsertionSort(int[] arr) {
        super(arr);
    }

    void insertionSort() {

    }
}

class SelectionSort extends ArraySorting {
    public SelectionSort() {}

    public SelectionSort(int[] arr) {
        super(arr);
    }

    void selectionSort() {
        for(int i = 0; i < length; i++) {
            int minIndex = i;
            for(int j = i + 1; j < length; j++) {
                if(arr[j] < arr[minIndex]) minIndex = j;
            }
            // Swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}

class ArrayTester {
    public static void main(String[] args) {
        int[] arr1 = {5, 2, 4, 1, 3, 6, 0};
        int[] arr2 = {55, 11, 44, 22, 33};
        int[] arr3 = {50, 10, 40, 30, 20};
        BubbleSort bs = new BubbleSort(arr1);
        SelectionSort ss = new SelectionSort(arr2);
        InsertionSort is = new InsertionSort(arr3);
        bs.bubbleSort();
        ss.selectionSort();
        is.insertionSort();
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }
}
