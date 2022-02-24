package place_in_table;

//Level - 800
//Link: https://codeforces.com/problemset/problem/1017/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int sum = 0, ans = 1;

        for (int i = 0; i < 4; i++) {
            int buff = sc.nextInt();
            sum += buff;
        }

        for (int i = 2; i <= n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            if (a + b + c + d > sum) {
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}
