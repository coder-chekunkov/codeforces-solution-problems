package summer_school;

//Level - 800
//Link: https://codeforces.com/problemset/problem/672/A

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= 1000; i++) {
            stringBuilder.append(i);
        }

        String str = String.valueOf(stringBuilder);
        System.out.println(str.charAt(n - 1));

    }
}
