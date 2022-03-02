package entertaining_alchemy;

//Level - 800
//Link: https://codeforces.com/problemset/problem/912/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long yellow = sc.nextLong();
        long blue = sc.nextLong();
        long needYellow = sc.nextLong();
        long needGreen = sc.nextLong();
        long needBlue = sc.nextLong();

        long buffNeedYellow = needYellow * 2 + needGreen;
        long buffNeedBlue = needBlue * 3 + needGreen;

        long sum = Math.max(0, buffNeedYellow - yellow) + Math.max(0, buffNeedBlue - blue);
        if (sum < 0) System.out.println(0);
        else System.out.println(sum);

    }
}