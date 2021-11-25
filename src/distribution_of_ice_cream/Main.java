package distribution_of_ice_cream;

//Level - 800
//Link: https://codeforces.com/problemset/problem/686/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long n = sc.nextInt();
        long x = sc.nextInt();
        int kol_sad_child = 0;

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            String number = sc.next();
            long num = Integer.parseInt(number);

            if (str.charAt(0) == '+') {
                x += num;
            } else {
                if (num > x) {
                    kol_sad_child += 1;
                } else {
                    x -= num;
                }
            }
        }
        System.out.println(x + " " + kol_sad_child);
    }
}