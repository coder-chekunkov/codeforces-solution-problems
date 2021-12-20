package squard_string;

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
        String str = sc.next();
        if (str.length() % 2 != 0 || str.length() == 1){
            System.out.println("NO");
        } else {
            int buff = str.length() / 2;
            StringBuilder stringBuilderOne = new StringBuilder();
            StringBuilder stringBuilderTwo = new StringBuilder();

            for (int i = 0; i < buff; i++) {
                stringBuilderOne.append(str.charAt(i));
            }
            for (int i = buff; i < str.length(); i++) {
                stringBuilderTwo.append(str.charAt(i));
            }

            String one = String.valueOf(stringBuilderOne);
            String two = String.valueOf(stringBuilderTwo);


            if (one.equals(two)){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
            //System.out.println(stringBuilderOne + " " + stringBuilderTwo);


        }
    }
}