package free_cash_register;

//Level - 1000
//Link: https://codeforces.com/problemset/problem/237/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int max = 1;
        int[][] time = new int[24][60];

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            time[x][y] += 1;
            if(max < time[x][y])
                max = time[x][y];
        }


        System.out.println(max);
    }
}