package patrik_and_walk_to_shop;

//Level - 800
//Link: https://codeforces.com/problemset/problem/599/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        int d3 = sc.nextInt();

        int ans = Math.min(d1+d2+d3, Math.min(2*(d1+d2), Math.min(d1*2+d3*2,d2*2+d3*2)));
        System.out.println(ans);
    }
}
