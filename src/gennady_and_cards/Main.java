package gennady_and_cards;

//Level - 800
//Link: https://codeforces.com/problemset/problem/1097/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String str = sc.next();

        boolean buff = false;

        for (int i = 0; i < 5; i++) {

            String str_cards = sc.next();

            if (str.charAt(0) == str_cards.charAt(0) || str.charAt(1) == str_cards.charAt(1)) {
                buff = true;
                break;
            }

        }

        if (!buff) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }


    }
}