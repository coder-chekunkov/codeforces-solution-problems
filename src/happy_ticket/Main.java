package happy_ticket;

//Level - 800
//Link: https://codeforces.com/problemset/problem/146/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int kol = sc.nextInt();
        String n = sc.next();
        boolean isAllNumbers = true;

        for (int i = 0; i < kol; i++) {
            if (n.charAt(i) != '4' && n.charAt(i) != '7') {
                isAllNumbers = false;
                break;
            }
        }

        if (!isAllNumbers) System.out.println("NO");
        else {
            int firstSum = 0, secondSum = 0;
            char[] mas = n.toCharArray();

            for (int i = 0; i < kol / 2; i++) {
                firstSum += Integer.parseInt(String.valueOf(mas[i]));
            }

            for (int i = kol / 2; i < kol; i++) {
                secondSum += Integer.parseInt(String.valueOf(mas[i]));
            }

            if (firstSum == secondSum) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
