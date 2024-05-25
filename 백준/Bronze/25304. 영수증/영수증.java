import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalPrice = sc.nextInt();
        int totalCnt = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < totalCnt; i++) {
            int price = sc.nextInt();
            int cnt = sc.nextInt();
            sum += price * cnt;
        }

        String answer = totalPrice == sum ? "Yes" : "No";

        System.out.println(answer);
    }
}