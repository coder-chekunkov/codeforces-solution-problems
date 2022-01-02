package busy;

//Level - 800
//Link: https://codeforces.com/problemset/problem/78/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int x = sc.nextInt();
        int kol = 0;
        ArrayList<Integer> mas = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            mas.add(sc.nextInt());
        }

        for (int i = 0; i < k; i++) {
            mas.set(mas.size() - 1 - i, x);
        }

        for (Integer i : mas) {
            kol += i;
        }

        System.out.println(kol);

    }
}