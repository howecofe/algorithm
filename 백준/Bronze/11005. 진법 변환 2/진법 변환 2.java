import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        long n = sc.nextLong();
        int b = sc.nextInt();

        while (n > 0) {
            if (10 <= n % b && n % b <= 35) {
                sb.insert(0, (char)(n % b + 55));
            } else {
                sb.insert(0, String.valueOf(n % b));
            }

            n /= b;
        }

        System.out.println(sb.toString());
    }
}