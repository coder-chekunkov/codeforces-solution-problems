package arena;

//Level - 800
//Link: https://codeforces.com/problemset/problem/1487/A

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

        boolean isEqual = true;

        for (int i = 0; i < n; i++) {
            mas[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            if (mas[i] != mas[i + 1]) {
                isEqual = false;
                break;
            }
        }

        if (isEqual) {
            System.out.println(0);
        } else {
            int min = 1001;
            int kol_min = 0;

            for (int i = 0; i < n; i++) {
                if (mas[i] < min) min = mas[i];
            }

            for (int i = 0; i < n; i++) {
                if (mas[i] == min) kol_min += 1;
            }

            int ans = n - kol_min;

            System.out.println(ans);
        }
    }
}