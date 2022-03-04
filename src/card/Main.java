package card;

//Level - 800
//Link: https://codeforces.com/problemset/problem/701/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int av = 0, sum = 0;
        ArrayList<Integer> mas = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            mas.add(sc.nextInt());
            sum += mas.get(i);
        }

        av = (sum / n) * 2;
        for (int i = 1; i <= n; i++) {
            if (mas.get(i) != 0) {
                for (int j = 1; j <= n; j++) {
                    if (mas.get(i) + mas.get(j) == av && i != j) {
                        System.out.println(i + " " + j);
                        mas.set(i, 0);
                        mas.set(j, 0);
                    }
                }
            }
        }
    }
}