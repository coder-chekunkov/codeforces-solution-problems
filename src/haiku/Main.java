package haiku;

//Level - 800
//Link: https://codeforces.com/problemset/problem/78/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = sc.nextLine();
        int one = 0, two = 0, three = 0;
        ArrayList<Character> symbols = new ArrayList<>();
        symbols.add('a');
        symbols.add('e');
        symbols.add('i');
        symbols.add('o');
        symbols.add('u');

        for (int i = 0; i < str1.length(); i++) {
            if (symbols.contains(str1.charAt(i))) one += 1;
        }

        for (int i = 0; i < str2.length(); i++) {
            if (symbols.contains(str2.charAt(i))) two += 1;
        }

        for (int i = 0; i < str3.length(); i++) {
            if (symbols.contains(str3.charAt(i))) three += 1;
        }

        if (one == 5 && two == 7 && three == 5) System.out.println("YES");
        else System.out.println("NO");
    }
}