package delete_zero;

//Level - 800
//Link: https://codeforces.com/problemset/problem/1303/A

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
        int firstID = str.length() + 1;
        int lastID = -1;
        int kol = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                if (i < firstID) {
                    firstID = i;
                } else {
                    if (i > lastID) {
                        lastID = i;
                    }
                }
            }
        }

        for (int i = firstID; i < lastID; i++) {
            if (str.charAt(i) == '0') kol += 1;
        }

        System.out.println(kol);
    }
}