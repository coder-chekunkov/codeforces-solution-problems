package chain_drive;

//Level - 900
//Link: https://codeforces.com/problemset/problem/215/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int kol = 0, max = -1;
        int n = sc.nextInt();
        int[] one = new int[n];

        for (int i = 0; i < n; i++) {
            one[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] two = new int[m];

        for (int i = 0; i < m; i++) {
            two[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (two[i] % one[j] == 0 && two[i] / one[j] > max) max = two[i] / one[j];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (two[i] / one[j] == max && two[i] % one[j] == 0) kol += 1;
            }
        }

        System.out.println(kol);
    }
}