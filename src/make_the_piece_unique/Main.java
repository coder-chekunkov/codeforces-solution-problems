package make_the_piece_unique;

//Level - 900
//Link: https://codeforces.com/problemset/problem/1335/B

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int kol = 0, k = 0, sum = 1;
        ArrayList<Integer> mas = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int buff = sc.nextInt();

            if (buff != 0) {
                if (buff <= -1) sum *= -1;
            }

            if (buff > 1) {
                kol += buff - 1;
            }

            if (buff < -1) {
                kol += Math.abs(-1 - buff);
            }

            if (buff == 0) k += 1;
        }

        if (k == 0) {
            if (sum != 1) {
                kol += 2;
            }
        } else {
            kol += k;
        }

        System.out.println(kol);
    }
}