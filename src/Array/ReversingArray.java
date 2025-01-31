package Array;

public class ReversingArray
{
    public static void main(String[] args) {
        Arrays arr = new Arrays(6);
        arr.makeArray();
        int[] arr1 = arr.getArray();
        printArray(arr1);
        arr1 = reverseArray1(arr1);
        printArray(arr1);
        reverseArray2(arr1);
        printArray(arr1);
    }

    public static void printArray(int[]arr) {
        for (int x : arr) {
            System.out.print(x + "  ");
        }
        System.out.println("\n===================================");
    }

    // out of place/ creating a new array
    public static int[] reverseArray1(int[] arr) {
        int[] tempArr = new int[arr.length];
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            tempArr[i] = arr[j];
        }
//        printArray(arr);
        return tempArr;
    }

    // in place/ without creating a new array
    public static void reverseArray2(int[] arr) {
        for(int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1- i];
            arr[arr.length -1 - i] = temp;
        }
    }
}
