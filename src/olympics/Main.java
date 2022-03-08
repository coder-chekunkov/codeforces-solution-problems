package olympics;

//Level - 800
//Link: https://codeforces.com/problemset/problem/937/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        HashSet<Integer> mas = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int buff = sc.nextInt();
            if (buff != 0) mas.add(buff);
        }

        System.out.println(mas.size());
    }
}