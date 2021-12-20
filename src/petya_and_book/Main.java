package petya_and_book;

//Level - 1000
//Link: https://codeforces.com/problemset/problem/139/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] mas = new int[7];

        for (int i = 0; i < 7; i++) {
            mas[i] = sc.nextInt();
        }

        int day = 1;
        while (n >= 0) {
            n -= mas[day - 1];
            day += 1;
            if (n <= 0) {
                break;
            } else {
                if (day == 8) {
                    day = 1;
                }
            }
        }
        System.out.println(day - 1);
    }
}