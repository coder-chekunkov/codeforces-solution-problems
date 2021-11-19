package cossack_vus_and_the_contest;

//Level - 800
//Link: https://codeforces.com/problemset/problem/1186/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        if (a <= b && a <= c) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}