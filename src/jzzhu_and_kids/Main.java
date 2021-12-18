package jzzhu_and_kids;

//Level - 1000
//Link: https://codeforces.com/problemset/problem/450/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> mas = new ArrayList<>();
        ArrayList<Integer> index = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            mas.add(sc.nextInt());
            index.add(i + 1);
        }

        while (true) {
            if (mas.size() == 0) {
                break;
            } else {
                if (mas.size() == 1) {
                    System.out.println(index.get(0));
                    break;
                } else {
                    int buff = mas.get(0) - m;
                    if (buff > 0) {
                        mas.add(buff);
                        index.add(index.get(0));
                    }
                    mas.remove(0);
                    index.remove(0);
                }
            }
        }
    }
}