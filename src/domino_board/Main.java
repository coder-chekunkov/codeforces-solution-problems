package domino_board;

//Level - 800
//Link: https://codeforces.com/problemset/problem/1567/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            solution();
        }
    }

    public static void solution(){
        int n = sc.nextInt();
        String str = sc.next();
        StringBuilder str_ans = new StringBuilder();
        for (int i = 0; i < n; i++) {
            switch (str.charAt(i)) {
                case 'U' -> str_ans.append("D");
                case 'L' -> str_ans.append("L");
                case 'R' -> str_ans.append("R");
                case 'D' -> str_ans.append("U");
            }
        }
        System.out.println(str_ans);
    }
}