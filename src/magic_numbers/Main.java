package magic_numbers;

//Level - 900
//Link: https://codeforces.com/problemset/problem/320/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String number = sc.next();
        if (is_magical(number)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean is_magical(String number) {
        for (int i = 0; i < (int)number.length(); i++){
            if (number.charAt(i) != '1' && number.charAt(i) != '4')
                return false;
        }

        if (number.charAt(0) == '4')
            return false;

        if (number.indexOf("444") != -1)
            return false;
        return true;
    }
}