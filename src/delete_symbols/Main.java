package delete_symbols;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            solution();
        }
    }

    public static void solution() {
        String str = sc.next();
        String t = sc.next();

        boolean isTrue = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == t.charAt(0) && i % 2 == 0) {
                isTrue = true;
                break;
            }
        }

        if (isTrue) System.out.println("YES");
        else System.out.println("NO");
    }
}