package picture_frames;

//Level - 1000
//Link: https://codeforces.com/problemset/problem/127/B

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        ArrayList<Integer> mas = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> mas_kol = new ArrayList<>();
        int kol = 0;

        for (int i = 0; i < n; i++) {
            int buff = sc.nextInt();
            mas.add(buff);
            set.add(buff);
        }

        for (Integer buff : set) {
            int buff_kol = 0;
            for (Integer ma : mas) {
                if (buff.equals(ma)) buff_kol += 1;
            }
            mas_kol.add(buff_kol);
        }

        for (Integer integer : mas_kol) {
            kol += integer / 2;
        }

        System.out.println(kol / 2);
    }
}