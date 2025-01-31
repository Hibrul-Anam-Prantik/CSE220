package Array;
import java.util.Arrays;

public class RightShifting {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(arr));
        System.out.println("=====================================");
        rightShift1(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("=====================================");
        int[] arr1 = {10, 20, 30, 40, 50};
        rightShift2(arr1);
        System.out.println(Arrays.toString(arr1));
    }
/*
   before: [10, 20, 30, 40, 50]
   after : [0, 10, 20, 30, 40]
*/
    public static void rightShift1(int[] arr) {
        for(int i = arr.length - 1; i > 0 ; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = 0;
    }

    /*
   before: [10, 20, 30, 40, 50]
   after : [50, 10, 20, 30, 40]
*/
    public static void rightShift2(int[] arr) {
        for(int i = arr.length - 1; i > 0 ; i--) {
            int temp = arr[i - 1];
            arr[i - 1] = arr[i];
            arr[i] = temp;
        }
    }
}
