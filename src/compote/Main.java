package compote;

//Level - 800
//Link: https://codeforces.com/problemset/problem/746/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int kol = Math.min(a, b / 2);
        kol = Math.min(kol, c / 4);
        System.out.println(kol * 7);
    }
}