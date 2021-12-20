package squart_and_cube;

import java.util.ArrayList;
import java.util.Scanner;

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
        int kol = 0, i = 1;

        ArrayList<Integer> cb = new ArrayList<>();
        while (true) {
            if (i * i * i <= n) {
                cb.add(i * i * i);
                kol += 1;
            } else {
                break;
            }
            i += 1;
        }

        i = 1;
        while (true) {
            if (i * i <= n) {
                if (!cb.contains(i * i)) kol += 1;
            } else {
                break;
            }
            i += 1;
        }

        System.out.println(kol);
    }
}