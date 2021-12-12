package diverse_team;

//Level - 800
//Link: https://codeforces.com/problemset/problem/988/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] mas = new int[n];
        ArrayList<Integer> mas_ans = new ArrayList<>();
        ArrayList<Integer> mas_id = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            mas[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (mas_ans.size() < k && !mas_ans.contains(mas[i])) {
                mas_ans.add(mas[i]);
                mas_id.add(i + 1);
            }
        }

        if (mas_ans.size() == k) {
            System.out.println("YES");
            for (Integer i :
                    mas_id) {
                System.out.println(i);
            }
        } else {
            System.out.println("NO");
        }
    }
}