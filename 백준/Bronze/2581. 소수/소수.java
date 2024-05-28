import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum = 0;
        int min = -1;

        for (int i = n1; i <= n2; i++) {
            if (i == 1) continue;

            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                if (min == -1) min = i;
                sum += i;
            }
        }

        if (sum != 0) System.out.println(sum);
        System.out.println(min);
    }
}