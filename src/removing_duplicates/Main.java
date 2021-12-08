package removing_duplicates;

//Level - 800
//Link: https://codeforces.com/problemset/problem/978/A

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        ArrayList<Integer> mas = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            mas.add(x);
            if (!numbers.contains(x)) numbers.add(x);
        }

        Collections.reverse(mas);
        for (int x : mas) {
            if (numbers.contains(x)) {
                ans.add(x);
                numbers.remove(new Integer(x));
            }

        }

        Collections.reverse(ans);
        System.out.println(ans.size());
        for (Integer x :
                ans) {
            System.out.println(x);
        }
    }
}
