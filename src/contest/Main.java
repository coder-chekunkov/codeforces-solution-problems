package contest;

//Level - 900
//Link: https://codeforces.com/problemset/problem/501/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int misha = Math.max((3 * a) / 10, a - (a / 250) * c);
        int vasya = Math.max((3 * b) / 10, b - (b / 250) * d);

        if (misha > vasya){
            System.out.println("Misha");
        }
        if (misha < vasya){
            System.out.println("Vasya");
        }
        if (misha == vasya){
            System.out.println("Tie");
        }

    }
}
