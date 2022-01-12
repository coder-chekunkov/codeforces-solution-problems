package plus_one_per_subset;

//Level - 800
//Link: https://codeforces.com/problemset/problem/1624/A

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

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
        ArrayList<Integer> mas = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            mas.add(sc.nextInt());
        }

        int min = Collections.min(mas);
        int max = Collections.max(mas);

        System.out.println(max - min);
    }
}
