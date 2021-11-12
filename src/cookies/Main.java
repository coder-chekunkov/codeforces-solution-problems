package cookies;

//Level - 900
//Link: https://codeforces.com/problemset/problem/129/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] mas = new int[n];
        int ans = 0, sum = 0, kol_chet = 0, kol_nechet = 0;

        for (int i = 0; i < n; i++) {
            mas[i] = sc.nextInt();
            sum += mas[i];
            if (mas[i] % 2 == 0) kol_chet += 1;
            if (mas[i] % 2 != 0) kol_nechet += 1;
        }

        if (sum % 2 == 0) {
            System.out.println(kol_chet);
        } else {
            System.out.println(kol_nechet);
        }
    }
}
