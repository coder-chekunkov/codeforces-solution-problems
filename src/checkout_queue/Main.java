package checkout_queue;

//Level - 900
//Link: https://codeforces.com/problemset/problem/408/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] kol_people = new int[n];
        int min = 1000000000;

        for (int i = 0; i < n; i++) {
            kol_people[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < kol_people[i]; j++) {
                int buff = sc.nextInt();
                sum += buff * 5;
            }
            sum += kol_people[i] * 15;
            if (sum < min) min = sum;
        }

        System.out.println(min);
    }
}
