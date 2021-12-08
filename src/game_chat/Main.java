package game_chat;

//Level - 800
//Link: https://codeforces.com/problemset/problem/716/A

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
        int n = sc.nextInt();
        String str = sc.next();
        int symbol = 0, bracket = 0;

        StringBuilder stringBuilder = new StringBuilder(new StringBuilder(str).reverse().toString());

        for (int i = 0; i < n; i++) {
            if (stringBuilder.charAt(i) == ')') bracket += 1;
            else break;
        }
        symbol = n - bracket;

        if (bracket > symbol) System.out.println("YES");
        else System.out.println("NO");
    }
}