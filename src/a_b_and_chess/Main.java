package a_b_and_chess;

//Level - 900
//Link: https://codeforces.com/problemset/problem/519/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int sum_white = 0;
        int sum_black = 0;

        for (int i = 0; i < 8; i++) {
            String str = sc.next();
            for (int j = 0; j < 8; j++) {
                switch (str.charAt(j)) {
                    case 'Q' -> sum_white += 9;
                    case 'R' -> sum_white += 5;
                    case 'B', 'N' -> sum_white += 3;
                    case 'P' -> sum_white += 1;
                    case 'q' -> sum_black += 9;
                    case 'r' -> sum_black += 5;
                    case 'b', 'n' -> sum_black += 3;
                    case 'p' -> sum_black += 1;
                }
            }
        }

        if (sum_black == sum_white) {
            System.out.println("Draw");
        }
        if (sum_black > sum_white) {
            System.out.println("Black");
        }
        if (sum_black < sum_white) {
            System.out.println("White");
        }
    }
}