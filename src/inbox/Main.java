package inbox;

//Level - 1000
//Link: https://codeforces.com/problemset/problem/465/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int kol = 0, p = 0;
        ArrayList<Integer> mas = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            mas.add(sc.nextInt());
        }

        for (int i = 0; i < n; i++) {
            kol += (2 - p) * mas.get(i);
            p = mas.get(i);
        }

        System.out.println(Math.max(kol - 1, 0));
    }
}