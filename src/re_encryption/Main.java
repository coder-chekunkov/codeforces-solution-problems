package re_encryption;

//Level - 800
//Link: https://codeforces.com/problemset/problem/1095/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        String str = sc.next();

        StringBuilder ans = new StringBuilder();
        int buff = 1;

        int j = 0;
        for (int i = 0; i < n; j++, i += j) {
            ans.append(str.charAt(i));
        }
        System.out.println(ans);
    }
}