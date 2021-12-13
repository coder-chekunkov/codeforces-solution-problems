package string_exercise;

//Level - 900
//Link: https://codeforces.com/problemset/problem/118/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> vowel = new ArrayList<>();
        String[] vowel_buff = {"A", "O", "Y", "E", "U", "I", "a", "o", "y", "e", "u", "i"};
        for (String str_buff : vowel_buff) {
            vowel.add(str_buff);
        }
        StringBuilder str_ans = new StringBuilder();

        String str = sc.next();
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            String c = String.valueOf(str.charAt(i));
            if (!vowel.contains(c)) {
                str_ans.append(".").append(c);
            }
        }

        System.out.println(str_ans);
    }
}