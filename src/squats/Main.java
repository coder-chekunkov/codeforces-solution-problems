package squats;

//Level - 900
//Link: https://codeforces.com/problemset/problem/424/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        String str = sc.next();
        int up = 0, down = 0, ans;
        StringBuilder ans_str = new StringBuilder(str);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') down += 1;
            else up += 1;
        }

        ArrayList<Integer> id_up = new ArrayList<>();
        ArrayList<Integer> id_down = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == 'x') id_down.add(i);
            else id_up.add(i);
        }

        if (down > n / 2) {
            ans = Math.abs(n / 2 - down);
            System.out.println(ans);
            for (int i = 0; i < ans; i++) {
                ans_str.setCharAt(id_down.get(i), 'X');
            }
        } else {
            ans = Math.abs(n / 2 - up);
            System.out.println(ans);
            for (int i = 0; i < ans; i++) {
                ans_str.setCharAt(id_up.get(i), 'x');
            }
        }
        System.out.println(ans_str);
    }
}
