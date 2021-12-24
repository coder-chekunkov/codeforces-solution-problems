package queue_at_the_bus_stop;

//Level - 1000
//Link: https://codeforces.com/problemset/problem/435/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int kol = 1;
        ArrayList<Integer> mas = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            mas.add(sc.nextInt());
        }

        int people = 0;
        for (int i = 0; i < n; i++) {
            if (people + mas.get(i) <= m)
                people += mas.get(i);
            else {
                kol++;
                people = mas.get(i);
            }
        }

        System.out.println(kol);
    }
}