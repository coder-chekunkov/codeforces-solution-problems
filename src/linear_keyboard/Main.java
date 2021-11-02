package linear_keyboard;

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        String str2 = "";
        String str1 = "";
        for (int z = 0; z < n; z++) {

            str1 = sc.next();
            str2 = sc.next();

            int[] mas = new int[str2.length()];
            int sum = 0;

            for (int i = 0; i < str2.length(); i++) {
                int index = str1.indexOf(str2.charAt(i)) + 1;
                mas[i] = index;
            }

            for (int i = 1; i < mas.length; i++) {
                sum += Math.abs(mas[i] - mas[i-1]);
            }
            System.out.println(sum);
        }
    }
}