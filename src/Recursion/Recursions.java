package Recursion;

import java.util.Scanner;

public class Recursions
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Multiplication Table of " + n + ": ");
        multiplicationTable(n, 1);
        System.out.println("Fibonacci Sequence upto " + n + "-th term: ");
        fibonacci(n, 0, 1);
        System.out.println("=============X==============");
        System.out.println(n + "! = " + factorial(n));
        System.out.println("=============X==============");
    }
    public static void multiplicationTable(int n, int m) {
        if(m == 11) {
            return;
        }
        System.out.println(n + " x " + (m) + " = " + (n * m));
        multiplicationTable(n, m + 1);
        if(m == 10) {
            System.out.println("=============X==============");
        }
    }

    public static void fibonacci(int n, int a, int b) {
        if(n == 0) {
            System.out.println();
            return;
        }
        System.out.print(a + " ");
        fibonacci(n -1, b, a + b);
    }

    public static int factorial(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
