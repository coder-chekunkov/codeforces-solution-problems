package scarborough_fair;

//Level - 800
//Link: https://codeforces.com/problemset/problem/897/B

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        String str = sc.next();
        char[] chars = str.toCharArray();

        for (int i = 0; i < m; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            String c1 = sc.next();
            String c2 = sc.next();

            for (int j = l - 1; j < r; j++) {
                if (chars[j] == c1.charAt(0)) chars[j] = c2.charAt(0);
            }
        }

        StringBuilder ans = new StringBuilder();
        for (char ch : chars) {
            ans.append(ch);
        }

        System.out.println(ans);
    }
}
