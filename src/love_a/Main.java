package love_a;

//Level - 800
//Link: https://codeforces.com/problemset/problem/1146/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = sc.next();
        int length = str.length();
        int kol_a = 0;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == 'a') kol_a += 1;
        }
        System.out.println(Math.min(length, 2 * kol_a - 1));
    }
}
