package Array;

import java.util.Arrays;

public class Insertion
{
    public static boolean isPossible(int length, int size, int index) {
        if(length == size) {
            System.out.println("No Empty Space!");
            return false;
        }
        if(index < 0 || index > size) {
            System.out.println("Invalid Index!");
            return false;
        }
        return true;
    }
    public static void insert(int index, int element, int size, int[]arr) {
//        int j = 1;
//        for(int i = size; i >= index; i--) {
//            arr[i] = arr[size - (j++)];
//        }
        for(int i = size - 1; i >= index; i--) {
            arr[i +1] = arr[i];
        }
        arr[index] = element;
        System.out.println("Insertion Successful!!");
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 0, 0, 0};
        int size = 5;
        int index = 2;
        int element = 200;
        if(isPossible(arr.length, size, index)) {
            insert(index, element, size, arr);
        }
        System.out.println(Arrays.toString(arr));
    }
}
