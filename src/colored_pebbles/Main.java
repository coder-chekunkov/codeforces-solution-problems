package colored_pebbles;

//Level - 800
//Link: https://codeforces.com/problemset/problem/265/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str1 = sc.next();
        String str2 = sc.next();
        int ans = 0;

        for (int i = 0; i < str2.length(); i++) {
            if (str1.charAt(ans) == str2.charAt(i)) {
                ans += 1;
            }
        }
        System.out.println(ans + 1);
    }
}