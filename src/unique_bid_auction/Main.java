package unique_bid_auction;

//Level - 800
//Link: https://codeforces.com/problemset/problem/1454/B

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            solution();
        }
    }

    public static void solution() {
        int n = sc.nextInt();
        int[] mas = new int[n];
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            mas[i] = x;
            if (!numbers.contains(x)) numbers.add(x);
        }

        Collections.sort(numbers);

        int buff = -1;
        for (int x : numbers) {
            int kol = 0;
            for (int j = 0; j < n; j++) {
                if (mas[j] == x) kol += 1;
            }
            if (kol == 1) {
                buff = x;
                break;
            }
        }

        if (buff == -1) {
            System.out.println(-1);
        } else {
            for (int i = 0; i < n; i++) {
                if (mas[i] == buff) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
    }
}
