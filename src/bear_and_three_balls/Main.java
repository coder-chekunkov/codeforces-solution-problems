package bear_and_three_balls;

//Level - 900
//Link: https://codeforces.com/problemset/problem/653/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] mas = new int[n];
        ArrayList<Integer> ans = new ArrayList<>();
        boolean buff = false;

        for (int i = 0; i < n; i++) {
            mas[i] = sc.nextInt();
        }

        Arrays.sort(mas);

        for (int i = 0; i < n; i++) {
            if (!ans.contains(mas[i])) ans.add(mas[i]);
        }

        for (int i = 0; i < ans.size() - 2; i++) {
            if (ans.get(i) + 1 == ans.get(i + 1) && ans.get(i + 1) + 1 == ans.get(i + 2)) {
                buff = true;
                break;
            }
        }

        if (buff) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}