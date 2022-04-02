package bear_and_five_cards;

//Level - 800
//Link: https://codeforces.com/problemset/problem/680/A

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = -1, sum = 0, buff = 0, s = 0;

        ArrayList<Integer> mas = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int buff_nu = sc.nextInt();
            mas.add(buff_nu);
            s += buff_nu;
        }

        Collections.sort(mas);
        Collections.reverse(mas);
        int best_remove = 0;
        for (int i = 0; i < 5; ++i) {
            if (i + 1 < 5 && mas.get(i).equals(mas.get(i + 1)))
                best_remove = Math.max(best_remove, 2 * mas.get(i));
            if (i + 2 < 5 && mas.get(i).equals(mas.get(i + 2)))
                best_remove = Math.max(best_remove, 3 * mas.get(i));
        }

        System.out.println(s - best_remove);
    }
}
