import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        String answer = "";

        if (a + b + c != 180) answer = "Error";
        else {
            if (a == b && b == c) answer = "Equilateral";
            else if (a != b && a != c && b != c) answer = "Scalene";
            else answer = "Isosceles";
        }

        System.out.println(answer);
    }
}