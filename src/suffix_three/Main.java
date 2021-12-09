package suffix_three;

//Level - 800
//Link: https://codeforces.com/problemset/problem/1281/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            solution();
        }
    }

    public static void solution() {
        String str = sc.next();
        char ans = str.charAt(str.length() - 1);

        if (ans == 'o') System.out.println("FILIPINO");
        if (ans == 'u') System.out.println("JAPANESE");
        if (ans == 'a') System.out.println("KOREAN");
    }
}