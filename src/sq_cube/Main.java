package sq_cube;

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
        HashSet<Integer> mas = new HashSet<>();
        int n = sc.nextInt();

        for (int i = 1; i * i <= n; i++) {
            mas.add(i * i);
        }

        for (int i = 1; i * i * i <= n; i++) {
            mas.add(i * i * i);
        }

        System.out.println(mas.size());
    }
}
