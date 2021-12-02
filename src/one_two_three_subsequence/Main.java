package one_two_three_subsequence;

//Level - 900
//Link: https://codeforces.com/problemset/problem/52/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int one = 0;
        int two = 0;
        int three = 0;

        for (int i = 0; i < n; i++) {
            int buff = sc.nextInt();
            if (buff == 1) one += 1;
            if (buff == 2) two += 1;
            if (buff == 3) three += 1;
        }

        int max1 = Math.max(one, two);
        int max = Math.max(max1, three);

        int ans = n - max;
        System.out.println(ans);
    }
}