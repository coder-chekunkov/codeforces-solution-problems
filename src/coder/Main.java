package coder;

//Level - 800
//Link: https://codeforces.com/problemset/problem/384/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();

        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i % 2 == 0 && j % 2 == 0) || (i % 2 == 1 && j % 2 == 1))
                    cnt++;
            }
        }

        System.out.println(cnt);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i % 2 == 0 && j % 2 == 0) || (i % 2 == 1 && j % 2 == 1))
                    System.out.print("C");
                else
                    System.out.print(".");
            }
            System.out.println();
        }
    }
}