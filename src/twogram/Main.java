package twogram;

//Level - 900
//Link: https://codeforces.com/problemset/problem/977/B

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        String str = sc.next();
        ArrayList<String> under_str = new ArrayList<>();
        int[] mas_number = new int[n];


        for (int i = 0; i < n - 1; i++) {
            String new_str = str.charAt(i) + "" + str.charAt(i + 1);
            if (!under_str.contains(new_str)) {
                under_str.add(new_str);
            }
        }

        for (int i = 0; i < n - 1; i++) {
            String new_str = str.charAt(i) + "" + str.charAt(i + 1);
            for (int j = 0; j < under_str.size(); j++) {
                if (new_str.equals(under_str.get(j))){
                    mas_number[j] += 1;
                }
            }
        }

        int max_index = -1, max = -1;
        for (int i = 0; i < mas_number.length; i++) {
            if (mas_number[i] > max){
                max = mas_number[i];
                max_index = i;
            }
        }

        System.out.println(under_str.get(max_index));
    }
}