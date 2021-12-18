package caps_lock;

//Level - 1000
//Link: https://codeforces.com/problemset/problem/131/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = sc.next();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toUpperCase().toCharArray();
        boolean isFirst = false, isLast = false;
        int buff_kol = 0;
        for (char value : alphabet) {
            if (str.charAt(0) == value) {
                isFirst = true;
                break;
            }
        }

        if (str.length() != 1) {
            for (int i = 1; i < str.length(); i++) {
                for (char c : alphabet) {
                    if (str.charAt(i) == c) buff_kol += 1;
                }
            }
        }

        if (buff_kol == str.length() - 1) isLast = true;

        if (str.length() == 1) {
            if (isFirst) System.out.println(str.toLowerCase());
            else System.out.println(str.toUpperCase());
        } else {
            if (isFirst && isLast) System.out.println(str.toLowerCase());
            if (!isFirst && !isLast) System.out.println(str);
            if (isFirst && !isLast) System.out.println(str);
            if (!isFirst && isLast) {
                StringBuilder stringBuilder = new StringBuilder();
                StringBuilder stringBuilder_buff_last = new StringBuilder();
                String str_buff_first = String.valueOf(str.charAt(0));
                stringBuilder.append(str_buff_first.toUpperCase());
                for (int i = 1; i < str.length(); i++) {
                    stringBuilder_buff_last.append(str.charAt(i));
                }
                String str_buff_last = String.valueOf(stringBuilder_buff_last);
                str_buff_last = str_buff_last.toLowerCase();
                stringBuilder.append(str_buff_last);
                System.out.println(stringBuilder);
            }
        }
    }
}
