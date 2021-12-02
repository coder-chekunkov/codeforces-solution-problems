package couples_at_university;

//Level - 900
//Link: https://codeforces.com/problemset/problem/847/G

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] buff_mas = new int[7];
        int max = -1;

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '1') buff_mas[j] += 1;
            }
        }

        for (int buff_ma : buff_mas) {
            if (buff_ma >= max) max = buff_ma;
        }

        System.out.println(max);
    }
}