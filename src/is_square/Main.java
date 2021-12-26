package is_square;

//Level - 900
//Link: https://codeforces.com/problemset/problem/1351/B

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
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();

        int aMIN = Math.min(a1, a2);
        int bMIN = Math.min(b1, b2);
        int aMAX = Math.max(a1, a2);
        int bMAX = Math.max(b1, b2);

        if (aMAX == bMAX && aMIN + bMIN == aMAX) System.out.println("Yes");
        else System.out.println("No");
    }
}
