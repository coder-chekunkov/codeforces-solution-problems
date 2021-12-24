package berland_fashion;

//Level - 1000
//Link: https://codeforces.com/problemset/problem/691/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int kol_zero = 0;
        ArrayList<Integer> mas = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            mas.add(sc.nextInt());
        }

        for (int i = 0; i < n; i++) {
            if (mas.get(i) == 0) kol_zero += 1;
        }

        if (n == 1) {
            if (mas.get(0) == 1) System.out.println("YES");
            else System.out.println("NO");
        } else {
            if (kol_zero == 1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}