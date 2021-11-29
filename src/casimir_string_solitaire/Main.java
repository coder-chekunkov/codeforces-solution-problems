package casimir_string_solitaire;

//Level - 800
//Link: https://codeforces.com/problemset/problem/1579/B

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
        String str = sc.next();

        int b_count = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'B') b_count += 1;
        }

        if (str.length() % 2 == 0) {
            if (str.length() / 2 == b_count) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }

    }
}