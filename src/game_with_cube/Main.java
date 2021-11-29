package game_with_cube;

//Level - 800
//Link: https://codeforces.com/problemset/problem/378/B

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int a_sum = 0;
        int b_sum = 0;
        int c_sum = 0;

        for (int i = 1; i <= 6; i++) {
            if (Math.abs(a - i) < Math.abs(b - i)) {
                a_sum += 1;
            } else {
                if (Math.abs(a - i) > Math.abs(b - i)) {
                    b_sum += 1;
                } else {
                    if (Math.abs(a - i) == Math.abs(b - i)) {
                        c_sum += 1;
                    }
                }
            }
        }

        System.out.println(a_sum + " " + c_sum + " " + b_sum);
    }
}