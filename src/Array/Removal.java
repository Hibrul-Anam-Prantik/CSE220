package Array;

import java.util.Arrays;

public class Removal
{
    public static void removal(int[] arr, int index, int size) {
        for(int i = index; i <= size; i++) {
            arr[i] = arr[i + 1];
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 0, 0, 0};
        int size = 5;
        int index = 2;
        removal(arr, index, size);
        System.out.println(Arrays.toString(arr));
    }
}
