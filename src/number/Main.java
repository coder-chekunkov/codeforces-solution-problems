package number;

//Level - 800
//Link: https://codeforces.com/problemset/problem/1060/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        String str = sc.next();
        int buffN = n / 11;
        int buff8 = 0;
        for (int i = 0; i < str.length(); i++) if (str.charAt(i) == '8') buff8 += 1;

        int ans = Math.min(buff8, buffN);
        System.out.println(ans);
    }
}