package anton_and_numbers;

//Level - 800
//Link: https://codeforces.com/problemset/problem/734/B

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int k2 = sc.nextInt(), k3 = sc.nextInt(), k5 = sc.nextInt(), k6 = sc.nextInt();
        int k256Buff = Math.min(k2, k5);
        int k256 = Math.min(k256Buff, k6);
        k2 -= k256;
        int k32 = 0, sum = 0;
        if (k2 > 0) {
            k32 = Math.min(k2, k3);
            sum = k256 * 256 + k32 * 32;
        } else {
            sum = k256 * 256;
        }

        System.out.println(sum);
    }
}