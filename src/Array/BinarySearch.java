package Array;

import java.util.Scanner;

public class BinarySearch
{
    public static int search(int[] numbers, int key) {
        int start = 0, end = numbers.length - 1;

        while(start <= end) {
            int mid = (start + end) / 2;

            if(numbers[mid] == key) {
                return mid;
            }

            if(numbers[mid] < key) {    // right
                start = mid + 1;
            } else {     // left
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to Search: ");
        int key = sc.nextInt();
        int index = search(numbers, key);
        if(index == -1) System.out.println(key + " Not Found!");
        else System.out.println(key + " Found at index " + index + ".");
        sc.close();
    }
}