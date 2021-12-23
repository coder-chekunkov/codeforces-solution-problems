package watching_film;

//Level - 1000
//Link: https://codeforces.com/problemset/problem/499/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int x = sc.nextInt();
        int kol = 0, now = 0;

        while (n > 0) {
            n--;
            int l = sc.nextInt();
            int r = sc.nextInt();

            kol += r - l + 1;
            kol += (l - now - 1) % x;
            now = r;
        }
        System.out.println(kol);
    }
}