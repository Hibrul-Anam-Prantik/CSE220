package Array;
import java.util.Arrays;

public class LinearArray {

    public static void main(String[] args) {
        int[] arr = new int[6];
//        System.out.println(arr);
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        System.out.println(Arrays.toString(arr));
        System.out.println("===================");
        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.print("{");
        for (int value : arr2) {
            int i = arr2[arr2.length - 1];
            if (i != value) {
                System.out.print(value + ", ");
            }
            else { System.out.print(value); }
        }
        System.out.print("}");
    }
}
