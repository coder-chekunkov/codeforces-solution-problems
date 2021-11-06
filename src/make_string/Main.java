package make_string;

//Level - 900
//Link: https://codeforces.com/problemset/problem/1335/B

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            solution();
        }
    }

    public static void solution(){
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        String str = "";

        for (int i = 0; i < n; i++) {
            char new_symbol = (char) ('a' + i % b);
            str = str + new_symbol;
        }

        System.out.println(str);


    }
}