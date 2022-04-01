package blackjack;

//Level - 800
//Link: https://codeforces.com/problemset/problem/104/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();

        if (n <= 10) System.out.println("0");
        if (n == 11) System.out.println("4");
        if (n >= 12 && n <= 19) System.out.println("4");
        if (n == 20) System.out.println("15");
        if (n == 21) System.out.println("4");
        if (n >= 22) System.out.println("0");


    }
}