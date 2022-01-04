package bar;

//Level - 1000
//Link: https://codeforces.com/problemset/problem/56/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int kol = 0;

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            boolean hasDigit = str.matches(".*\\d+.*");
            if (hasDigit) {
                //число:
                int buff = Integer.parseInt(str);
                if (buff < 18) kol += 1;
            } else {
                //строка:
                if (str.equals("ABSINTH") || str.equals("BEER") || str.equals("BRANDY") ||
                        str.equals("CHAMPAGNE") || str.equals("GIN") || str.equals("RUM") ||
                        str.equals("SAKE") || str.equals("TEQUILA") || str.equals("VODKA") ||
                        str.equals("WHISKEY") || str.equals("WINE")) kol += 1;
            }
        }

        System.out.println(kol);
    }
}