package duff_and_meat;

//Level - 900
//Link: https://codeforces.com/problemset/problem/588/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int a = 0, b = 0;
        int ans = 0;
        int mini = 1000000000;
        for (int i = 0; i < n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            mini = Math.min(mini, b);
            ans += a * mini;
        }
        System.out.println(ans);
    }
}