package garden;

//Level - 900
//Link: https://codeforces.com/problemset/problem/915/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] mas = new int[n];
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            mas[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (k % mas[i] == 0) {
                int buff = k / mas[i];
                ans.add(buff);
            }
        }
        System.out.println(ans.stream().min(Comparator.naturalOrder()).get());
    }
}
