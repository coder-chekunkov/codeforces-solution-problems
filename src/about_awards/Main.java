package about_awards;

//Level - 800
//Link: https://codeforces.com/problemset/problem/448/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int b3 = sc.nextInt();
        int k = sc.nextInt();

        int a = (a1 + a2 + a3 + 4) / 5;
        int b = (b1 + b2 + b3 + 9) / 10;

        if (a + b <= k) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}