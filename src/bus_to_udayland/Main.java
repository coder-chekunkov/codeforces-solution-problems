package bus_to_udayland;

//Level - 800
//Link: https://codeforces.com/problemset/problem/711/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        String[] bus = new String[n];
        boolean buff = false;

        for (int i = 0; i < n; i++) {
            bus[i] = sc.next();
        }

        for (int i = 0; i < n; i++) {
            if (bus[i].charAt(0) == 'O' && bus[i].charAt(1) == 'O') {
                bus[i] = "++|" + bus[i].charAt(3) + bus[i].charAt(4);
                buff = true;
                break;
            }

            if (bus[i].charAt(3) == 'O' && bus[i].charAt(4) == 'O') {
                bus[i] = String.valueOf(bus[i].charAt(0)) + String.valueOf(bus[i].charAt(1)) + "|++";
                buff = true;
                break;
            }
        }

        if (!buff) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            for (int i = 0; i < n; i++) {
                System.out.println(bus[i]);
            }
        }
    }
}