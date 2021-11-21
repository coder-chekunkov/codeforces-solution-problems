package epic_game;

//Level - 800
//Link: https://codeforces.com/problemset/problem/119/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        int t = 1;

        while (n > 0) {
            t = (t + 1) % 2;
            if (t == 0) {
                n -= nod(n, a);
            } else {
                n -= nod(n, b);
            }
        }

        System.out.println(t);
    }

    public static int nod(int a, int b) {
        return b == 0 ? a : nod(b, a % b);
    }
}