import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();
        int target = sc.nextInt();
        String answer = "";

        for (int i = 0; i < len; i++) {
            int n = sc.nextInt();
            if (n < target) answer = answer + n + " ";
        }

        System.out.println(answer.trim());
    }
}