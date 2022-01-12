package make_ap;

//Level - 900
//Link: https://codeforces.com/problemset/problem/1624/B

import java.util.Scanner;

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
        int c = sc.nextInt();

        if (a == b && b == c) System.out.println("YES");
        else {
            int new_a = b - (c - b);
            if (new_a >= a && new_a % a == 0 && new_a != 0) {
                System.out.println("YES");
                return;
            }

            int new_b = a + (c - a) / 2;
            if (new_b >= b && (c - a) % 2 == 0 && new_b % b == 0 && new_b != 0) {
                System.out.println("YES");
                return;
            }

            int new_c = a + 2 * (b - a);
            if (new_c >= c && new_c % c == 0 && new_c != 0) {
                System.out.println("YES");
                return;
            }

            System.out.println("NO");
        }
    }
}