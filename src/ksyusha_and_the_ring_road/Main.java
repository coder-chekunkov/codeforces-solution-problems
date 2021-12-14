package ksyusha_and_the_ring_road;

//Level - 1000
//Link: https://codeforces.com/problemset/problem/339/B

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long pos = 1, res = 0, temp;
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < m; ++i) {
            temp = sc.nextLong();
            res = temp < pos ? n - pos + temp : temp - pos;
        }

        System.out.println(res);
    }
}