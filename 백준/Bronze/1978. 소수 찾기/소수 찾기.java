import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int answer = 0;

        for (int i = 0; i < cnt; i++) {
            int n = sc.nextInt();
            boolean isPrime = true;

            if (n == 1) continue;

            for (int j = 2; j < n; j++) {
                if (n % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) answer++;
        }

        System.out.println(answer);
    }
}