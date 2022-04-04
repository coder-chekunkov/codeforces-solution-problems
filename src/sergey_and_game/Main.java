package sergey_and_game;

//Level - 800
//Link: https://codeforces.com/problemset/problem/426/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int s = sc.nextInt();
        int kol = n - 1;
        ArrayList<Integer> mas = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            mas.add(sc.nextInt());
        }

        Collections.sort(mas);

        int buff = 0;
        for (int i = 0; i < kol; i++) {
            int num = mas.get(i);

            if (buff + num <= s) buff += num;
            else {
                buff = -1;
                break;
            }
        }

        if (buff == -1) System.out.println("NO");
        else System.out.println("YES");


    }
}