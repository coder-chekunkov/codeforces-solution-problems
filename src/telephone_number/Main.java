package telephone_number;

//Level - 900
//Link: https://codeforces.com/problemset/problem/424/A

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
        int n = sc.nextInt();
        String str = sc.next();
        int buff = n;

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '8') {
                buff = i;
                break;
            }
        }

        if (n - buff >= 11) System.out.println("YES");
        else System.out.println("NO");
    }
}