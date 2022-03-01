package song_about_love;

//Level - 800
//Link: https://codeforces.com/problemset/problem/1539/B

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int q = sc.nextInt();
        String str = sc.next();
        for (int i = 0; i < q; i++) {
            solution(str);
        }
    }

    public static void solution(String str) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int a = sc.nextInt() - 1;
        int b = sc.nextInt();
        int sum = 0;
        String buff = str.substring(a, b);

        for (int i = 0; i < buff.length(); i++) {
            int index = alphabet.indexOf(buff.charAt(i)) + 1;
            sum += index;
        }

        System.out.println(sum);


    }
}