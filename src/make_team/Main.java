package make_team;

//Solution of problem "B" from competition №756.
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
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a + b < 4 || a == 0 || b == 0) {
            System.out.println(0);
        } else {
            if (a == 1 || b == 1) {
                System.out.println(1);
            } else {
                int min = Math.min(a, b);
                int buff = (a + b) / 4;
                System.out.println(Math.min(buff, min));
            }
        }
    }
}
