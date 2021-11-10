package maximum_uninterrupted_rest;

//Level - 900
//Link: https://codeforces.com/problemset/problem/1141/B

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] mas = new int[n];
        int strat_end = 0;
        int kol = 0;
        int all = 0;

        for (int i = 0; i < n; i++) {
            mas[i] = sc.nextInt();
        }

        for (int i = 0; i < 2 * n; i++) {
            if (mas[i % n] == 1) {
                all++;
                kol = Math.max(kol, all);
            } else {
                all = 0;
            }
        }

        System.out.println(kol);
    }
}
