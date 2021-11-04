package keyboard;

//Level - 900
//Link: https://codeforces.com/problemset/problem/474/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String is = sc.next();
        String str = sc.next();

        String keyboard = "qwertyuiopasdfghjkl;zxcvbnm,./";
        String new_str = "";

        switch (is){
            case "R":
                for (int i = 0; i < str.length(); i++) {
                    int index = keyboard.indexOf(str.charAt(i));
                    index--;
                    new_str = new_str + keyboard.charAt(index);
                }
                break;
            case "L":
                for (int i = 0; i < str.length(); i++) {
                    int index = keyboard.indexOf(str.charAt(i));
                    index++;
                    new_str = new_str + keyboard.charAt(index);
                }
                break;
        }

        System.out.println(new_str);

    }
}