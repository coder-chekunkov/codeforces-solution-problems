package omkar_and_completeness;

//Level - 800
//Link: https://codeforces.com/problemset/problem/1372/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            solution();
        }
    }

    public static void solution() {
        int n = sc.nextInt();
        int[] mas = new int[n];

        for (int i = 0; i < n; i++) {
            mas[i] = 1;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println(" ");

    }
}