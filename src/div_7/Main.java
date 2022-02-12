package div_7;

//Level - 900
//Link: https://codeforces.com/problemset/problem/1633/A

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
        if (n % 7 == 0) System.out.println(n);
        else {
            int ans = -1;
            for (int i = 0; i < 10; i++) {
                if ((n - n % 10 + i) % 7 == 0) {
                    ans = n - n % 10 + i;
                }
            }
            System.out.println(ans);
        }
    }
}