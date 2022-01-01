package chess_for_three;

//Level - 900
//Link: https://codeforces.com/problemset/problem/893/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int s = 3;
        boolean isOk = true;

        for (int i = 0; i < n; i++) {
            int w = sc.nextInt();
            if (isOk) {
                if (w == s) isOk = false;
                s = 6 - w - s;
            }
        }

        if (isOk) System.out.println("YES");
        else System.out.println("NO");
    }
}