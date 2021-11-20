package code_lock;

//Level - 800
//Link: https://codeforces.com/problemset/problem/540/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();

        int[] code = new int[n];
        int[] key = new int[n];
        int sum = 0;

        String str1 = sc.next();
        String str2 = sc.next();

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(String.valueOf(str1.charAt(i)));
            int b = Integer.parseInt(String.valueOf(str2.charAt(i)));
            sum += Math.min(Math.abs(a - b), 10 - Math.abs(b - a));
        }

        System.out.println(sum);
    }
}