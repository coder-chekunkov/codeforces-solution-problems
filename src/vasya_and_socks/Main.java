package vasya_and_socks;

//Level - 900
//Link: https://codeforces.com/problemset/problem/460/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(n + Math.abs((n - 1) / (m - 1)));
    }
}