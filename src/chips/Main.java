package chips;

//Level - 800
//Link: https://codeforces.com/problemset/problem/92/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<Integer> mas = new ArrayList<>();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            mas.add(i);
            sum += i;
        }

        while (true) {
            if (m >= sum) m -= sum;
            else break;
        }

        if (m == 0) System.out.println(0);
        else {
            for (int buff : mas) {
                if (m >= buff) m -= buff;
                else {
                    System.out.println(m);
                    break;
                }
            }
        }
    }
}