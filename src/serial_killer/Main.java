package serial_killer;

//Level - 900
//Link: https://codeforces.com/problemset/problem/776/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String a = sc.next();
        String b = sc.next();
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println(a + " " + b);
            String c = sc.next();
            String d = sc.next();

            if (c.equals(a)) a = d;
            else b = d;
        }

        System.out.println(a + " " + b);
    }
}