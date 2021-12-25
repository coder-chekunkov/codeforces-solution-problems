package long_comparison;

//Level - 900
//Link: https://codeforces.com/problemset/problem/1613/A

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
        int x1 = sc.nextInt();
        int p1 = sc.nextInt();
        int x2 = sc.nextInt();
        int p2 = sc.nextInt();

        int mn = Math.min(p1, p2);
        p1 -= mn;
        p2 -= mn;
        if (p1 >= 7) {
            System.out.println(">");
        } else {
            if (p2 >= 7) System.out.println("<");
            else {
                for (int i = 0; i < p1; ++i) x1 *= 10;
                for (int i = 0; i < p2; ++i) x2 *= 10;
                if (x1 < x2) {
                    System.out.println("<");
                } else {
                    if (x1 > x2) System.out.println(">");
                    else System.out.println("=");
                }
            }
        }
    }
}