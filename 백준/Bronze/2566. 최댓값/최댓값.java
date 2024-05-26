import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = -1;
        int order = -1;

        for (int i = 0; i < 81; i++) {
            int n = sc.nextInt();
            if (n > max) {
                max = n;
                order = i;
            }
        }

        System.out.println(max);
        System.out.printf("%d %d", order / 9 + 1, order % 9 + 1);
    }
}