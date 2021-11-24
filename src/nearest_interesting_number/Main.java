package nearest_interesting_number;

//Level - 800
//Link: https://codeforces.com/problemset/problem/1183/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();

        while (true) {
            if (isInteresting(n)) {
                System.out.println(n);
                break;
            } else {
                n += 1;
            }
        }
    }

    public static boolean isInteresting(int n) {
        int sum = 0;
        while (n != 0) {
            sum += (n % 10);
            n /= 10;
        }
        return sum % 4 == 0;
    }
}