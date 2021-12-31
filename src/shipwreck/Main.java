package shipwreck;

//Level - 900
//Link: https://codeforces.com/problemset/problem/63/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> ranges = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String rang = sc.next();

            names.add(name);
            ranges.add(rang);
        }

        for (int i = 0; i < n; i++) {
            if (ranges.get(i).equals("rat")) System.out.println(names.get(i));
        }

        for (int i = 0; i < n; i++) {
            if (ranges.get(i).equals("woman") || ranges.get(i).equals("child")) System.out.println(names.get(i));
        }

        for (int i = 0; i < n; i++) {
            if (ranges.get(i).equals("man")) System.out.println(names.get(i));
        }

        for (int i = 0; i < n; i++) {
            if (ranges.get(i).equals("captain")) System.out.println(names.get(i));
        }
    }
}