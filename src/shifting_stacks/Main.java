package shifting_stacks;

//Level - 900
//Link: https://codeforces.com/problemset/problem/1486/A

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
        int n = sc.nextInt();
        int[] mas = new int[n];

        long sum = 0, need = 0;

        for (int i = 0; i < n; i++) {
            mas[i] = sc.nextInt();
        }

        for (int i = 0; i < n; ++i) {
            need += i;
            sum += mas[i];
            if (sum < need) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");





    }
}