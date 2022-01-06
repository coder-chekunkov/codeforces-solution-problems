package fibonacci;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите число: ");
        long n = sc.nextInt();
        System.out.print("1 1");
        fibonacci(1, 1, n - 3, 0);
    }

    public static void fibonacci(long a, long b, long n, long number) {
        if (number <= n) {
            number += 1;
            long buff = a + b;
            System.out.print(" " + buff);
            a = b;
            b = buff;
            fibonacci(a, b, n, number);
        }
    }
}
