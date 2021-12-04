package network_configuration;

//Level - 900
//Link: https://codeforces.com/problemset/problem/412/B

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] mas = new int[n];

        for (int i = 0; i < n; i++) {
            mas[i] = sc.nextInt();
        }

        Arrays.sort(mas);
        System.out.println(mas[mas.length - k]);
    }
}
