package fast_food_restaurant;

//Level - 900
//Link: https://codeforces.com/problemset/problem/1313/A

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
        ArrayList<Integer> mas = new ArrayList<>();
        int a = sc.nextInt();
        mas.add(a);
        int b = sc.nextInt();
        mas.add(b);
        int c = sc.nextInt();
        mas.add(c);
        int kol = 0;
        Collections.sort(mas);
        a = mas.get(0);
        b = mas.get(1);
        c = mas.get(2);

        if (a != 0) {
            kol += 1;
            a -= 1;
        }

        if (b != 0) {
            kol += 1;
            b -= 1;
        }

        if (c != 0) {
            kol += 1;
            c -= 1;
        }

        if (a != 0 && c != 0) {
            kol += 1;
            a -= 1;
            c -= 1;
        }

        if (a != 0 && b != 0) {
            kol += 1;
            a -= 1;
            b -= 1;
        }

        if (b != 0 && c != 0) {
            kol += 1;
            b -= 1;
            c -= 1;
        }

        if (a != 0 && c != 0 && b != 0) {
            kol += 1;
            a -= 1;
            b -= 1;
            c -= 1;
        }

        System.out.println(kol);
    }
}