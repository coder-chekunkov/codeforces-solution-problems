package greatest_increase;

//Level - 800
//Link: https://codeforces.com/problemset/problem/702/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] mas = new int[n];
        int max = -1, count = 1;


        for (int i = 0; i < n; i++) {
            mas[i] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {
            if (mas[i] > mas[i - 1])
                count += 1;
            else {
                if (count > max) max = count;
                count = 1;
            }
        }

        if (count > max) max = count;

        System.out.println(max);


    }
}