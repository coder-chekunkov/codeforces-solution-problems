package arya_and_brayan;

//Level - 900
//Link: https://codeforces.com/problemset/problem/839/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] mas = new int[n];
        int kol = 0, cur = 0;

        for (int i = 0; i < n; i++) {
            mas[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            cur += mas[i];
            int buff = Math.min(8, cur);
            cur -= buff;
            k -= buff;
            kol += 1;
            if (k <= 0) break;
        }

        if (k > 0) System.out.println(-1);
        else System.out.println(kol);

    }
}