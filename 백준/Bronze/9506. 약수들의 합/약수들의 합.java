import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        while ((n = sc.nextInt()) != -1) {
            List<Integer> list = new ArrayList<>();
            int sum = 0;

            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                    list.add(i);
                }
            }

            if (sum == n) {
                Collections.sort(list);
                String answer = "" + sum + " =";

                for (int num : list) {
                    answer += " " + num + " " + "+";
                }

                System.out.println(answer.substring(0, answer.length() - 2));
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }
    }
}