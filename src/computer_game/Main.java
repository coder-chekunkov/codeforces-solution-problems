package computer_game;

//Level - 800
//Link: https://codeforces.com/problemset/problem/1598/A

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
        String str1 = sc.next();
        String str2 = sc.next();
        boolean isNormal = true;

        for (int i = 0; i < n; i++) {
            if (str1.charAt(i) == '1' && str2.charAt(i) == '1') {
                isNormal = false;
                break;
            }
        }

        if (isNormal) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}