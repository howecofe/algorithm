import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer = "int";
        StringBuilder sb = new StringBuilder(answer);

        int n = sc.nextInt();
        for (int i = 0; i < n / 4; i++) {
            sb.insert(0, "long ");
        }

        System.out.println(sb.toString());
    }
}