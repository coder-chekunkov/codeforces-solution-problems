package inc_ARG;

//Level - 900
//Link: https://codeforces.com/problemset/problem/465/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        String str = sc.next();
        int kol = 0;

        for (int i = 0; i < n - 1; i++) {
            if (str.charAt(i) == '1' && str.charAt(i + 1) == '1') kol += 1;
            else if (str.charAt(i) == '1' && str.charAt(i + 1) == '0') {
                kol += 1;
                break;
            }
        }

        if (str.charAt(0) == '0') System.out.println(1);
        else System.out.println(kol + 1);
    }
}