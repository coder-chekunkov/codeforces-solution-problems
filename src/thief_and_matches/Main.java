package thief_and_matches;

//Level - 900
//Link: https://codeforces.com/problemset/problem/16/B

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int kol = 0;
        ArrayList<Integer> kol_box = new ArrayList<>();
        ArrayList<Integer> kol_in_box = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            kol_box.add(sc.nextInt());
            kol_in_box.add(sc.nextInt());
        }

        if (m == 1) {
            if (n >= kol_box.get(0)) {
                kol += kol_box.get(0) * kol_in_box.get(0);
            } else {
                kol += n * kol_in_box.get(0);
            }
        } else {
            while (true) {
                int buff = -1;
                int max = -1;
                for (int i = 0; i < kol_in_box.size(); i++) {
                    if (kol_in_box.get(i) > max) {
                        buff = i;
                        max = kol_in_box.get(i);
                    }
                }

                if (buff != -1) {
                    if (n >= kol_box.get(buff)) {
                        n -= kol_box.get(buff);
                        kol += kol_box.get(buff) * kol_in_box.get(buff);
                        kol_box.remove(buff);
                        kol_in_box.remove(buff);
                    } else {
                        kol += n * kol_in_box.get(buff);
                        break;
                    }
                } else {
                    break;
                }
            }
        }

        System.out.println(kol);
    }
}