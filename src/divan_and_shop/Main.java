package divan_and_shop;

//Level - 800
//Link: https://codeforces.com/problemset/problem/1614/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            solution();
        }
    }

    public static void solution() {
        int n = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();
        int k = sc.nextInt();
        int kol = 0, cost = 0;
        ArrayList<Integer> mas = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int buff = sc.nextInt();
            if (buff <= r && buff >= l) {
                mas.add(buff);
            }
        }

        Collections.sort(mas);
        for (int buff : mas) {
            if (buff + cost <= k) {
                cost += buff;
                kol += 1;
            }
        }

        System.out.println(kol);
    }
}