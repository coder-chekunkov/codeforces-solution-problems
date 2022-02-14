package seat_gathering;

//Level - 900
//Link: https://codeforces.com/problemset/problem/1330/A

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
        int x = sc.nextInt();
        boolean achieve[] = new boolean[201];

        for (int i = 1; i <= n + x; i++) {
            achieve[i] = false;
        }
        for (int i = 1; i <= n; i++) {
            int ranking = sc.nextInt();
            achieve[ranking] = true;
        }
        for (int k = n + x; k > 0; k--) {
            int v = 0;
            for (int i = 1; i <= k; i++) {
                if (!achieve[i]) v++;
            }
            if (v <= x) {
                System.out.println(k);
                return;
            }
        }
    }
}
