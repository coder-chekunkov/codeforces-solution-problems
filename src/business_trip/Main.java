package business_trip;

//Level - 800
//Link: https://codeforces.com/problemset/problem/149/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int kol = 0, buff = 0, j = 0;
        ArrayList<Integer> mas = new ArrayList<>();

        for (int i = 0; i < 12; i++) {
            mas.add(sc.nextInt());
        }

        Collections.sort(mas);
        Collections.reverse(mas);

        for (Integer ma : mas) {
            buff += ma;
            kol += 1;
            if (buff >= n) break;
        }

        if (n == 0) System.out.println(0);
        else {
            if (buff < n) System.out.println(-1);
            else System.out.println(kol);
        }
    }
}