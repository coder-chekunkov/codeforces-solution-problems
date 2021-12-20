package sum_of_digits;

//Level - 1000
//Link: https://codeforces.com/problemset/problem/102/B

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.next();
        int n = 0;
        int kol = 0;
        while (s.length() != 1) {
            for (int i = 0; i < s.length(); i++) {
                char p = s.charAt(i);
                n += p - '0';
            }
            s = String.valueOf(n);
            n = 0;
            kol += 1;
        }

        System.out.println(kol);
    }
}