package fun_to_click_on_the_panel;

//Level - 900
//Link: https://codeforces.com/problemset/problem/373/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int k = sc.nextInt();
        Character[][] mas = new Character[4][5];
        int[] cnt = new int[10];

        for (int i = 0; i < 4; i++) {
            String buff = sc.next();
            for (int j = 0; j < 4; j++) {
                mas[i][j] = buff.charAt(j);
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (mas[i][j] != '.') {
                    cnt[mas[i][j] - '0']++;
                }
            }
        }

        boolean isTrue = true;

        for (int i = 1; i <= 9; i++)
            if (cnt[i] > 2 * k) {
                isTrue = false;
                break;
            }

        if (isTrue) System.out.println("YES");
        else System.out.println("NO");
    }
}