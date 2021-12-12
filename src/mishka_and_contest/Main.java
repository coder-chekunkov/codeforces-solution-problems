package mishka_and_contest;

//Level - 800
//Link: https://codeforces.com/problemset/problem/999/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int kol = 0;
        ArrayList<Integer> mas = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            mas.add(sc.nextInt());
        }

        while (true) {
            if (mas.size() == 0) {
                break;
            } else {
                if (mas.get(0) <= k) {
                    kol += 1;
                    mas.remove(0);
                } else {
                    if (mas.get(mas.size() - 1) <= k) {
                        kol += 1;
                        mas.remove(mas.size() - 1);
                    } else {
                        break;
                    }
                }
            }
        }
        System.out.println(kol);
    }
}