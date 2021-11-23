package i_am_bored_with_life;

//Level - 800
//Link: https://codeforces.com/problemset/problem/894/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int factorial_a = getFactorial(a);
        int factorial_b = getFactorial(b);
        int nod = getNod(factorial_a, factorial_b);
        System.out.println(nod);

    }

    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }

    public static int getNod(int a, int b) {
        return b == 0 ? a : getNod(b, a % b);
    }
}
