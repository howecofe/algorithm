import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int answer = 0;

        if (x * y > 0) {
            if (x > 0) answer = 1;
            else answer = 3;
        } else {
            if (x > 0) answer = 4;
            else answer = 2;
        }

        System.out.println(answer);
    }
}