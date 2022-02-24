package egors_train;

//Level - 800
//Link: https://codeforces.com/problemset/problem/255/A

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int a = 0, b = 0, c = 0;
        for (int i = 1; i <= n; i++) {
            int buff = sc.nextInt();
            if (i % 3 == 1) {
                a += buff;
            }
            if (i % 3 == 2) {
                b += buff;
            }
            if (i % 3 == 0) {
                c += buff;
            }
        }

        if (a > b && a > c) System.out.println("chest");
        if (b > a && b > c) System.out.println("biceps");
        if (c > a && c > b) System.out.println("back");
    }
}
