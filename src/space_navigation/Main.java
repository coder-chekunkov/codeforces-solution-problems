package space_navigation;

//Level - 800
//Link: https://codeforces.com/problemset/problem/1481/A

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
        int x = sc.nextInt();
        int y = sc.nextInt();
        String str = sc.next();

        int r = 0, l = 0, u = 0, d = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'R') r++;
            else if (str.charAt(i) == 'L') l++;
            else if (str.charAt(i) == 'U') u++;
            else d++;
        }
        int total = 0;
        if (x == 0) total++;
        else if (x > 0 && r >= x) total++;
        else if (x < 0 && l >= -x) total++;

        if (y == 0) total++;
        else if (y > 0 && u >= y) total++;
        else if (y < 0 && d >= -y) total++;

        if (total == 2) System.out.println("YES");
        else System.out.println("NO");;

    }
}