package second_statistic;

//Level - 800
//Link: https://codeforces.com/problemset/problem/2/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        Set<Integer> mas = new HashSet<>();
        for (int i = 0; i < n; i++) {
            mas.add(sc.nextInt());
        }

        List<Integer> list = new ArrayList<>(mas);
        Collections.sort(list);

        if (list.size() == 1) System.out.println("NO");
        else System.out.println(list.get(1));
    }
}