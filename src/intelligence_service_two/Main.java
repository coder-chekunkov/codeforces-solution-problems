package intelligence_service_two;

//Level - 800
//Link: https://codeforces.com/problemset/problem/34/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] mas = new int[n];

        for (int i = 0; i < n; i++) {
            mas[i] = sc.nextInt();
        }

        int a = 1, b = n, min = Math.abs(mas[0] - mas[n - 1]);

        for (int i = 0; i < n - 1; i++) {
            if (Math.abs(mas[i] - mas[i + 1]) < min) {
                min = Math.abs(mas[i] - mas[i + 1]);
                a = i + 1;
                b = i + 2;
            }
        }

        System.out.println(a + " " + b);
    }
}