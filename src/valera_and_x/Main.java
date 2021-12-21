package valera_and_x;

//Level - 1000
//Link: https://codeforces.com/problemset/problem/404/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        ArrayList<String> mas = new ArrayList<>();

        boolean idDiagonal = true, isInside = true;

        ArrayList<String> diagonal = new ArrayList<>();
        ArrayList<String> inside = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            mas.add(sc.next());
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + 1 == (n - j)) {
                    diagonal.add(String.valueOf(mas.get(i).charAt(j)));
                } else {
                    inside.add(String.valueOf(mas.get(i).charAt(j)));
                }
            }
        }

        for (int i = 0; i < diagonal.size() - 1; i++) {
            if (!diagonal.get(i).equals(diagonal.get(i + 1))) {
                idDiagonal = false;
                break;
            }
        }

        for (int i = 0; i < inside.size() - 1; i++) {
            if (!inside.get(i).equals(inside.get(i + 1))) {
                isInside = false;
                break;
            }
        }

        if (diagonal.contains(inside.get(0))) idDiagonal = false;
        if (isInside && idDiagonal) System.out.println("YES");
        else System.out.println("NO");
    }
}