package three_strings;

//Level - 800
//Link: https://codeforces.com/problemset/problem/1301/A

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
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        boolean isTrue = true;

        for (int i = 0; i < a.length(); i++) {
            if (c.charAt(i) != a.charAt(i) && c.charAt(i) != b.charAt(i)){
                isTrue = false;
                break;
            }
        }

        if (isTrue) System.out.println("YES");
        else System.out.println("NO");
    }
}
