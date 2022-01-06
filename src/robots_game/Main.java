package robots_game;

//Level - 900
//Link: https://codeforces.com/problemset/problem/670/B

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        for (int i = 1; i <= numbers.size(); i++) {
            if (k - i > 0) {
                k = k - i;
            } else {
                System.out.println(numbers.get(k - 1));
                break;
            }
        }
    }
}