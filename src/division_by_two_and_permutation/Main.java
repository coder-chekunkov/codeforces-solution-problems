package division_by_two_and_permutation;

//Level - 900
//Link: https://codeforces.com/problemset/problem/1624/B

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
        int[] mas = new int[n];
        ArrayList<Integer> buff_mas = new ArrayList<>();
        boolean isTrue = true;

        for (int i = 0; i < n; i++) {
            buff_mas.add(i + 1);
            mas[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int two = mas[i];

            if (buff_mas.contains(two)){
                int finalTwo = two;
                buff_mas.removeIf(s -> s.equals(finalTwo));
            } else {
                while (true) {
                    two = two / 2;
                    if (buff_mas.contains(two)){
                        int finalTwo = two;
                        buff_mas.removeIf(s -> s.equals(finalTwo));
                        break;
                    }
                    if (two == 0){
                        isTrue = false;
                        break;
                    }
                }
            }
        }

        if (isTrue) System.out.println("YES");
        else System.out.println("NO");
    }
}