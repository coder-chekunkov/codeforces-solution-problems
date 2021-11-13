package little_elephant_and_rozdol;

//Level - 900
//Link: https://codeforces.com/problemset/problem/205/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] mas = new int[n];

        int min = 1000000000;
        int kol_min = 0;
        int min_index = 0;

        if (n == 1){
            System.out.println(1);
        } else {
            for (int i = 0; i < n; i++) {
                mas[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                if (mas[i] < min) {
                    min = mas[i];
                    min_index = i + 1;
                }
            }

            for (int i = 0; i < n; i++) {
                if (mas[i] == min) {
                    kol_min += 1;
                }
            }

            if (kol_min == 1) {
                System.out.println(min_index);
            } else {
                System.out.println("Still Rozdil");
            }

        }


    }
}