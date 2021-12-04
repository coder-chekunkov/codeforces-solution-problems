package codecraft_III;

//Level - 900
//Link: https://codeforces.com/problemset/problem/45/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = sc.next();
        int n = sc.nextInt();
        int month = 0;

        if (str.equals("January")) month = 1;
        if (str.equals("February")) month = 2;
        if (str.equals("March")) month = 3;
        if (str.equals("April")) month = 4;
        if (str.equals("May")) month = 5;
        if (str.equals("June")) month = 6;
        if (str.equals("July")) month = 7;
        if (str.equals("August")) month = 8;
        if (str.equals("September")) month = 9;
        if (str.equals("October")) month = 10;
        if (str.equals("November")) month = 11;
        if (str.equals("December")) month = 12;

        if (n >= 12) {
            int buff = n / 12;
            n -= buff * 12;
        }

        month += n;

        if (month > 12) {
            int buff = month / 12;
            month -= buff * 12;
        }

        if (month == 1) str = "January";
        if (month == 2) str = "February";
        if (month == 3) str = "March";
        if (month == 4) str = "April";
        if (month == 5) str = "May";
        if (month == 6) str = "June";
        if (month == 7) str = "July";
        if (month == 8) str = "August";
        if (month == 9) str = "September";
        if (month == 10) str = "October";
        if (month == 11) str = "November";
        if (month == 12) str = "December";

        System.out.println(str);

    }
}