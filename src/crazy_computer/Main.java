package crazy_computer;

//Level - 800
//Link: https://codeforces.com/problemset/problem/716/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int c = sc.nextInt();
        int kol = 0;
        ArrayList<Integer> mas = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            mas.add(sc.nextInt());
        }

        Collections.reverse(mas);

        for (int i = 0; i < mas.size() - 1; i++) {
            if (mas.get(i) - mas.get(i + 1) <= c) kol += 1;
            else break;
        }

        System.out.println(kol + 1);
    }
}