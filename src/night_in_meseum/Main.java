package night_in_meseum;

//Level - 800
//Link: https://codeforces.com/problemset/problem/731/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String str = sc.next();
        String abc = "abcdefghijklmnopqrstuvwxyz";
        int sum = 0;

        int x = 0;
        int y = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < abc.length(); j++) {
                if (abc.charAt(j) == str.charAt(i)) y = j;
            }

            sum += Math.min(Math.abs(x - y), 26 - Math.abs(y - x));
            x = y;
        }
        System.out.println(sum);
    }
}
