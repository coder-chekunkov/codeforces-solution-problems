package interview;

//Level - 900
//Link: https://codeforces.com/problemset/problem/631/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int x = 0, y = 0;

        for (int i = 0; i < n; i++) {
            int buff = sc.nextInt();
            x |= buff;
        }

        for (int i = 0; i < n; i++) {
            int buff = sc.nextInt();
            y |= buff;
        }

        System.out.println(x + y);
    }
}