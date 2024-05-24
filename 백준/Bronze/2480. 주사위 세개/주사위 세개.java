import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int money = 0;

        if (n1 == n2 && n2 == n3) {
            money = 10000 + n1 * 1000;
        } else if (n1 != n2 && n2 != n3 && n1 != n3) {
            money = 100 * Math.max(Math.max(n1, n2), n3);
        } else if (n1 == n2 || n2 == n3) {
            money = 1000 + 100 * n2;
        } else {
            money = 1000 + 100 * n1;
        }

        System.out.println(money);
    }
}