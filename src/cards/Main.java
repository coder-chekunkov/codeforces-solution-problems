package cards;

//Level - 800
//Link: https://codeforces.com/problemset/problem/1220/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        String str = sc.next();

        int kol_n = 0;
        int kol_z = 0;
        StringBuilder str_ans = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == 'n') kol_n += 1;
        }

        kol_z = (n - (kol_n * 3)) / 4;

        str_ans.append("1 ".repeat(Math.max(0, kol_n)));

        str_ans.append("0 ".repeat(Math.max(0, kol_z)));

        System.out.println(str_ans);

    }
}
