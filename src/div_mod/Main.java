package div_mod;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            solution();
        }
    }

    public static void solution(){
        int l = sc.nextInt();
        int r = sc.nextInt();
        int x = sc.nextInt();

        int ans = r / x + r % x;
        int m = r / x * x - 1;

        if (m >= l) ans = Math.max(ans, m / x + m % x);

        System.out.println(ans );
    }
}