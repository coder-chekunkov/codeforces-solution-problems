package little_pony;

//Level - 800
//Link: https://codeforces.com/problemset/problem/454/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int count = 1;
        for (int i = 0; i < n / 2; i++) {
            String buff = "*".repeat(Math.max(0, n / 2 - i)) +
                    "D".repeat(Math.max(0, count)) +
                    "*".repeat(Math.max(0, n - (i + n / 2 + 1)));
            count += 2;
            System.out.println(buff);
        }

        System.out.println("D".repeat(Math.max(0, n)));

        count = n - 2;
        int buffCount = 1;
        for (int i = 0; i < n / 2; i++) {
            String buff = "*".repeat(Math.max(0, buffCount)) +
                    "D".repeat(Math.max(0, count)) +
                    "*".repeat(Math.max(0, buffCount));
            count -= 2;
            buffCount += 1;
            System.out.println(buff);
        }


    }
}