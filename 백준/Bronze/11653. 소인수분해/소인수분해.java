import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        if (n == 1) System.out.println();
        else {
            List<Integer> list = new ArrayList<>();

            while (n > 1) {
                for (int i = 2; i <= n; i++) {
                    if (n % i == 0) {
                        list.add(i);
                        n /= i;
                        break;
                    }
                }
            }

            for (int num : list) {
                System.out.println(num);
            }
        }

    }
}