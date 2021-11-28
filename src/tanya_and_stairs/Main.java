package tanya_and_stairs;

//Level - 800
//Link: https://codeforces.com/problemset/problem/1005/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] mas = new int[n];
        int kol = 0;
        ArrayList<Integer> mas_ans = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            mas[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (mas[i] == 1) {
                kol += 1;
                if (i != 0) {
                    mas_ans.add(mas[i - 1]);
                }
            }
        }
        mas_ans.add(mas[mas.length - 1]);

        System.out.println(kol);
        for (Integer i :
                mas_ans) {
            System.out.println(i);
        }

    }
}