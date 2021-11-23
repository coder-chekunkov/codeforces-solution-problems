package floor_number;

//Level - 800
//Link: https://codeforces.com/problemset/problem/1426/A

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
        int n = sc.nextInt();
        int x = sc.nextInt();

        if (n == 1 || n == 2){
            System.out.println("1");
        } else {
            System.out.println(Math.abs((n - 3) / x) + 2);

        }
    }
}
