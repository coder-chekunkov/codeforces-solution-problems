package singer_and_comic;

//Level - 900
//Link: https://codeforces.com/problemset/problem/439/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> mas = new ArrayList<>();
        int sum = 0;
        int n = sc.nextInt();
        int d = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int buff = sc.nextInt();
            mas.add(buff);
            sum += buff;
        }

        if (sum + 10 * (n - 1) > d) System.out.println(-1);
        else System.out.println((d - sum) / 5);
    }
}