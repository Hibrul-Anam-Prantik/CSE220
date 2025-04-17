package Lab05;

import java.util.Scanner;

public class Task1 {

    // Task 1A: Print numbers from 1 to 10 using a loop
    public static void task1A() {
        // TODO: Implement this using a loop
        int i = 0;
         while(i < 10) {
             System.out.print(++i + " ");
         }
    }

    // Task 1B: Print numbers from 1 to 10 using recursion
    public static void task1B_recursive(int i) {
        // TODO: Implement this recursively
        if(i == 11) return;
        System.out.print(i + " ");
        task1B_recursive(i + 1);
    }

    // Task 1C: Print numbers from 1 to n using a loop
    public static void task1C(int n) {
        // TODO: Implement this using a loop
        int i = 0;
        while(i < n) {
            System.out.print(++i + " ");
        }
    }

    // Task 1D: Print numbers from 1 to n using recursion
    public static void task1D_recursive(int i, int n) {
        // TODO: Implement this recursively
        if(i > n) return;
        System.out.print(i + " ");
        task1D_recursive(i + 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Driver code for testing Task 1 methods
        // Write on your own
        System.out.println("While Loop:");
        task1A();
        System.out.println("\n=========================");
        System.out.println("Recursion:");
        task1B_recursive(1);
        System.out.println("\n=========================");
        System.out.print("Enter a Number\n => ");
        int n = sc.nextInt();
        System.out.println("While Loop (N):");
        task1C(n);
        System.out.println("\n=========================");
        System.out.print("Enter a Number\n => ");
        n = sc.nextInt();
        System.out.println("Recursion (N):");
        task1D_recursive(1, n);
        System.out.println("\n=========================");
        sc.close();
    }
}
