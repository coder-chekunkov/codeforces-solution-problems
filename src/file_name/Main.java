package file_name;

//Level - 800
//Link: https://codeforces.com/problemset/problem/978/B

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int sum = 0;
        String str = sc.next();

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x' && str.charAt(i + 2) == 'x')
                sum++;
        }

        System.out.println(sum);
    }
}