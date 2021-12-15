package generous_kefa;

//Level - 900
//Link: https://codeforces.com/problemset/problem/841/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        String str = sc.next();
        ArrayList<Character> unique = new ArrayList<>();
        ArrayList<Integer> kol = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            char buff = str.charAt(i);
            if (!unique.contains(buff)) unique.add(buff);
        }

        for (int i = 0; i < unique.size(); i++) {
            int buff_kol = 0;
            int symbol = unique.get(i);
            for (int j = 0; j < n; j++) {
                if (symbol == str.charAt(j)) buff_kol += 1;
            }
            kol.add(buff_kol);
        }

        Collections.sort(kol);
        if (kol.get(kol.size() - 1) > k) System.out.println("NO");
        else System.out.println("YES");
    }
}