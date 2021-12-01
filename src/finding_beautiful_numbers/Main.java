package finding_beautiful_numbers;

//Level - 900
//Link: https://codeforces.com/problemset/problem/870/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        int ans = 100500;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                if (a[i] == b[j]) {
                    ans = Math.min(ans, a[i]);
                } else {
                    ans = Math.min(ans, a[i] * 10 + b[j]);
                    ans = Math.min(ans, b[j] * 10 + a[i]);
                }
            }
        }
        System.out.println(ans);
    }
}