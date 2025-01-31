package Array;

import java.util.Scanner;

public class Arrays
{
    public int[] arr;
    public int length;

    Scanner sc = new Scanner(System.in);
    public Arrays() {}

    Arrays(int length) {
        this.length = length;
    }

    public void setLength() {
//        Scanner sc = new Scanner(System.in);
        System.out.print("Length of the Array: ");
        this.length = sc.nextInt();
//        sc.close();
    }

    public int getLength() {
        return length;
    }

    public void makeArray(int length) {
        arr = new int[length];
//        Scanner sc2 = new Scanner(System.in);
        for (int i = 0; i < length; i++) {
            System.out.print("Enter Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
//        sc.close();
    }

    public void makeArray() {
        arr = new int[this.length];
//        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < this.length; i++) {
            System.out.print("Enter Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
//        sc.close();
    }

    public int[] getArray() {
        return arr;
    }
}

class ArrayBuilding {
    public static void main(String[] args) {
        Arrays arr1 = new Arrays(5);
        Arrays arr2 = new Arrays();
        System.out.println(arr1.getLength());
        arr1.makeArray();
        int[] firstArray = arr1.getArray();
//        for (int value : firstArray) {
//            System.out.print(value + "  ");
//        }
        printArray(firstArray);
        System.out.println("\n=====================");
        arr2.setLength();
        arr2.makeArray(arr2.length);
        int[] secondArray = arr2.getArray();
//        for (int value : secondArray) {
//            System.out.print(value + "  ");
//        }
        printArray(secondArray);
    }
    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + "  ");
        }
    }
}
