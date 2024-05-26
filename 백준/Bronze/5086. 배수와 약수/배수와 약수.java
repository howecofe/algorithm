import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        String answer = "";

        while ((a = sc.nextInt()) != 0 && (b = sc.nextInt()) != 0) {
            if (a % b == 0) answer = "multiple";
            else if (b % a == 0) answer = "factor";
            else answer = "neither";

            System.out.println(answer);
        }
    }
}