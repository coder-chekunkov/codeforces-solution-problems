package qaq;

//Level - 800
//Link: https://codeforces.com/problemset/problem/894/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'Q'){
                c += b;
                a++;
            }
            if (str.charAt(i) == 'A'){
                b += a;
            }
        }
        System.out.println(c);
    }
}