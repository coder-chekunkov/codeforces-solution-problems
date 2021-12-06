package football;

//Level - 1000
//Link: https://codeforces.com/problemset/problem/43/A

import java.util.*;

public class Main {

    static class Teams {
        String buff_str;

        public Teams(String buff_str) {
            this.buff_str = buff_str;
        }

        public String getBuff_str() {
            return buff_str;
        }

    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();

        ArrayList<Teams> team_strings = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            team_strings.add(new Teams(str));
            if (!strings.contains(str)) strings.add(str);
        }

        if (strings.size() == 1) {
            System.out.println(team_strings.get(0).getBuff_str());
        } else {

            String str_one = strings.get(0);
            String str_two = strings.get(1);

            long one = team_strings
                    .stream()
                    .filter(str -> Objects.equals(str.getBuff_str(), str_one))
                    .count();
            long two = team_strings
                    .stream()
                    .filter(str -> Objects.equals(str.getBuff_str(), str_two))
                    .count();

            if (one > two) {
                System.out.println(str_one);
            } else {
                System.out.println(str_two);
            }
        }
    }
}