package system_of_equations;

//Level - 800
//Link: https://codeforces.com/problemset/problem/214/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int kol = 0;

        for (int i = 0; i < 32; i++) {
            for (int j = 0; j < 32; j++) {
                if (i * i + j == n && i + j * j == m) kol += 1;
            }
        }

        System.out.println(kol);

    }
}