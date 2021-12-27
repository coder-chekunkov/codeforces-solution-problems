package quasi_palindrome;

//Level - 900
//Link: https://codeforces.com/problemset/problem/412/B

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        while (true) {
            if (n % 10 != 0) break;
            else {
                n /= 10;
            }
        }

        String str1 = String.valueOf(n);
        String str2 = remove(str1);

        if (str1.equals(str2)) System.out.println("YES");
        else System.out.println("NO");
    }

    public static String remove(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            result = str.charAt(i) + result;
        }

        return result;
    }
}