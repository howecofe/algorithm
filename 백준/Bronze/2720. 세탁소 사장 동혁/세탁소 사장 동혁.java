import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int q = 25, d = 10, n = 5, p = 1;

        for (int i = 0; i < T; i++) {
            int money = sc.nextInt();
            String answer = "";

            answer += money / q + " ";
            money %= q;
            answer += money / d + " ";
            money %= d;
            answer += money / n + " ";
            money %= n;
            answer += money / p;

            System.out.println(answer);
        }
    }
}