package gerald_and_candies;

//Level - 1000
//Link: https://codeforces.com/problemset/problem/334/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        a *= a;
        for (int i = 1; i <= a / 2; i++) {
            System.out.println(i + " " + (a + 1 - i));
        }
    }
}