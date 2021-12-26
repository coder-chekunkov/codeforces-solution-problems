package romaji;

//Level - 900
//Link: https://codeforces.com/problemset/problem/1008/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = sc.next();
        boolean isNormal = true;
        ArrayList<Character> ch = new ArrayList<>();
        ch.add('a');
        ch.add('o');
        ch.add('u');
        ch.add('i');
        ch.add('e');

        for (int i = 0; i < str.length(); i++) {
            if (!ch.contains(str.charAt(i)) && str.charAt(i) != 'n' && (i + 1 == str.length() || !ch.contains(str.charAt(i + 1)))) {
                isNormal = false;
                break;
            }
        }

        if (isNormal) System.out.println("YES");
        else System.out.println("NO");
    }
}
