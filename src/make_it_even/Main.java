package make_it_even;

//Solution of problem "A" from competition №756.
import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            solution();
        }
    }

    public static void solution() {
        String n = sc.next();

        boolean isEven = false;
        for (int i = 0; i < n.length(); i++) {
            if (Integer.parseInt(String.valueOf(n.charAt(i))) % 2 == 0) {
                isEven = true;
                break;
            }
        }

        if (!isEven) {
            System.out.println(-1);
        } else {
            if (Integer.parseInt(n) % 2 == 0) {
                System.out.println(0);
            } else {
                if (Integer.parseInt(String.valueOf(n.charAt(0))) % 2 == 0) {
                    System.out.println(1);
                } else {
                    System.out.println(2);

                }
            }
        }
    }
}