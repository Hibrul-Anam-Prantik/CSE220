package Array;

import java.util.Scanner;

public class LinearSearch
{
    public static void main(String[] args)
    {
        int[] numbers = {10, 20, 30, 15, 25, 40, 30, 35};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to Search: ");
        int key = sc.nextInt();
        int index = search(numbers, key);
        if(index == -1) System.out.println(key + " Not Found!");
        else System.out.println(key + " Found at index " + index + ".");
    }

    public static int search(int[] numbers, int key) {

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
