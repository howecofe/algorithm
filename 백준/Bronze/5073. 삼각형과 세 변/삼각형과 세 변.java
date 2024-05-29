import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        while ((a = sc.nextInt()) != 0 && (b = sc.nextInt()) != 0 && (c = sc.nextInt()) != 0) {
            String answer = "";
            int[] arr = new int[3];
            arr[0] = a;
            arr[1] = b;
            arr[2] = c;
            Arrays.sort(arr);

            if (arr[2] < arr[0] + arr[1]) {
                if (a == b && b == c) answer = "Equilateral";
                else if (a != b && a != c && b != c) answer = "Scalene";
                else answer = "Isosceles";
            } else {
                answer = "Invalid";
            }

            System.out.println(answer);
        }
    }
}