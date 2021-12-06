package exams;

//Level - 900
//Link: https://codeforces.com/problemset/problem/194/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();

        if (k < 3 * n) System.out.println(3 * n - k);
        else System.out.println(0);

    }
}