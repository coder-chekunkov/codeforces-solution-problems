package valera_and_antiques;

//Level - 1000
//Link: https://codeforces.com/problemset/problem/441/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int money = sc.nextInt();
        ArrayList<Integer> mas = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int q = sc.nextInt();
            for (int j = 0; j < q; j++) {
                int buff = sc.nextInt();
                if (money > buff) if (!mas.contains(i + 1)) mas.add(i + 1);
            }
        }

        System.out.println(mas.size());
        if (mas.size() != 0) {
            for (Integer i : mas) {
                System.out.println(i);
            }
        }
    }
}
