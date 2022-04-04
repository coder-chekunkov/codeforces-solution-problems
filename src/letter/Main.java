package letter;

//Level - 800
//Link: https://codeforces.com/problemset/problem/14/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<String> mas = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            mas.add(sc.nextLine());
        }

        int x_min = 51, x_max = -1;
        int y_min = 51, y_max = -1;

        int buff = 0;
        for (String str : mas) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '*' && i < x_min) x_min = i;
                if (str.charAt(i) == '*' && i > x_max) x_max = i;
            }

            if (str.contains("*") && buff < y_min) y_min = buff;
            if (str.contains("*") && buff > y_max) y_max = buff;

            buff += 1;
        }

        for (int i = y_min; i <= y_max; i++) {

            String str = mas.get(i);
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = x_min; j <= x_max; j++) {
                stringBuilder.append(str.charAt(j));
            }
            System.out.println(stringBuilder);


        }


//        StringBuilder stringBuilder;
//        boolean isOk = true;
//        for (String str : mas) {
//            if (str.contains("*")) {
//                stringBuilder = new StringBuilder();
//                for (int j = x_min; j <= x_max; j++) {
//                    stringBuilder.append(str.charAt(j));
//                }
//                System.out.println(stringBuilder);
//            }
//        }

    }
}