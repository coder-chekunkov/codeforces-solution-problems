package polycarp_and_sequence_sums;

//Level - 800
//Link: https://codeforces.com/problemset/problem/1618/A

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
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            mas.add(sc.nextInt());
        }

        int a = mas.get(0);
        int a_b_c = mas.get(6);
        int b_c = a_b_c - a;
        ans.add(a);

        for (int i = 1; i < 6; i++) {
            for (int j = i + 1; j < 6; j++) {
                if (ans.size() == 3) break;
                if (mas.get(i) + mas.get(j) == b_c) {
                    ans.add(mas.get(i));
                    ans.add(mas.get(j));
                }
            }
        }

        for (Integer i : ans) {
            System.out.println(i);
        }
    }
}
