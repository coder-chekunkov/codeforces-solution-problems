package delete_from_left;

//Level - 900
//Link: https://codeforces.com/problemset/problem/1005/B

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str1 = sc.next();
        String str2 = sc.next();
        int w = 0;

        while (true){
            int i = str1.length() - w - 1;
            int j = str2.length() - w - 1;

            if (i >= 0 && j >= 0 && str1.charAt(i) == str2.charAt(j)) w += 1;
            else break;
        }

        System.out.println(str1.length() + str2.length() - 2 * w);


    }
}