package Array;

import java.util.Arrays;

public class RightShiftBy_k_Places
{
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int k = 3;
        System.out.println(java.util.Arrays.toString(arr));
        System.out.println("=====================================");
        rightShift1(arr, k);
        System.out.println(java.util.Arrays.toString(arr));
        System.out.println("=====================================");
        int[] arr1 = {10, 20, 30, 40, 50};
        rightShift2(arr1, k);
        System.out.println(Arrays.toString(arr1));
    }
    /*
       before: [10, 20, 30, 40, 50]
       after : [0, 0, 10, 20, 30]
    */
    public static void rightShift1(int[] arr, int k) {
        for(int i = arr.length - 1; i >= k; i--) {
            arr[i] = arr[i - k];
        }
        // inserting 0
        for(int i = 0; i < k; i++) {
            arr[i] = 0;
        }
    }

    /*
   before: [10, 20, 30, 40, 50]
   after : [30, 40, 50, 10, 20]
*/
    public static void rightShift2(int[] arr, int k) {
        int[] tempArr = new int[k];
        for(int i = 0; i < k; i++) {
            tempArr[i] = arr[arr.length - k + i];
        }
        for(int i = arr.length - 1; i >= k; i--) {
            arr[i] = arr[i - k];
        }
        for(int i = 0; i < k; i++) {
            arr[i] = tempArr[i];
        }
    }

}