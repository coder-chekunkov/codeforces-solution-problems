package multiplication_table;

//Level - 1000
//Link: https://codeforces.com/problemset/problem/577/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int x = sc.nextInt();
        int kol = 0;
        for (int i = 1; i <= n; i++) {
            if (x % i == 0 && x / i <= n) {
                kol += 1;
            }
        }

        System.out.println(kol);
    }
}