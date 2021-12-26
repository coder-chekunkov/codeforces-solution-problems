package sonya_and_hotels;

//Level - 900
//Link: https://codeforces.com/problemset/problem/1004/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> mas = new ArrayList<>();
        int kol = 2;

        for (int i = 0; i < n; i++) {
            mas.add(sc.nextInt());
        }

        for (int i = 0; i < n - 1; i++) {
            if (mas.get(i + 1) - mas.get(i) > 2 * m) kol += 2;
            if (mas.get(i + 1) - mas.get(i) == 2 * m) kol += 1;
        }

        System.out.println(kol);
    }
}