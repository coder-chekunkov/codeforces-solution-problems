package borze_abc;

//Level - 800
//Link: https://codeforces.com/problemset/problem/32/B

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = sc.next();
        String ans_str = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '.') {
                ans_str += "0";
            } else {
                if (str.charAt(i) == '-' && str.charAt(i + 1) == '.'){
                    ans_str += "1";
                    i += 1;
                } else {
                    if (str.charAt(i) == '-' && str.charAt(i + 1) == '-'){
                        ans_str += "2";
                        i += 1;
                    }
                }
            }
        }
        System.out.println(ans_str);
    }
}