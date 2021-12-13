package christmas_candles;

//Level - 1000
//Link: https://codeforces.com/problemset/problem/379/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println((a * b - 1) / (b - 1));
    }
}