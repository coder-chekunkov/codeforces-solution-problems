package golden_autumn;

//Level - 900
//Link: https://codeforces.com/problemset/problem/44/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        ArrayList<Object> leaves = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String str_leave = sc.next();
            String str_color = sc.next();
            String buff = str_leave + " " + str_color;
            if (!leaves.contains(buff)) leaves.add(buff);
        }

        System.out.println(leaves.size());
    }
}