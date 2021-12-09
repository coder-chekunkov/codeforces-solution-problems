package a_plus_b_test_task;

//Level - 800
//Link: https://codeforces.com/problemset/problem/1351/A

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
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
    }
}
