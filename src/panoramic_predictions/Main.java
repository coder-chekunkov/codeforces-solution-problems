package panoramic_predictions;

//Level - 800
//Link: https://codeforces.com/problemset/problem/80/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();

        int index_a = -1;
        int mas[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 51};

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == a) index_a = i;
        }

        if (mas[index_a + 1] == b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}