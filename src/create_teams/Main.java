package create_teams;

//Level - 800
//Link: https://codeforces.com/problemset/problem/1092/B

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] mas = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            mas[i] = sc.nextInt();
        }

        Arrays.sort(mas);
        for (int i = 0; i < n - 1; i+=2) {
            sum += (mas[i+1] - mas[i]);
        }

        System.out.println(sum);


    }
}
