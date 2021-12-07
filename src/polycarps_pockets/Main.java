package polycarps_pockets;

//Level - 800
//Link: https://codeforces.com/problemset/problem/1092/B

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] mas = new int[n];
        ArrayList<Integer> arrayList = new ArrayList<>();
        int ans = -1;

        for (int i = 0; i < n; i++) {
            mas[i] = sc.nextInt();
        }

        Arrays.sort(mas);

        for (int i = 0; i < n; i++) {
            if (!arrayList.contains(mas[i])) arrayList.add(mas[i]);
        }

        for (Integer integer : arrayList) {
            int buff = 0;
            for (int j = 0; j < n; j++) {
                if (mas[j] == integer) buff += 1;
            }

            if (buff > ans) ans = buff;
        }

        System.out.println(ans);
    }
}