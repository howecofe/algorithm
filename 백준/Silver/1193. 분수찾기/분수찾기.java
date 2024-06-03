import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0, sum = 0;
        int a = 0, b = 0;

        while (sum < n) {
            i++;
            sum += i;
        }

        int order = n - (sum - i);

        if (i % 2 == 0) {
            a = order;
            b = (i + 1) - a;
        } else {
            b = order;
            a = (i + 1) - b;
        }

        System.out.println(a + "/" + b);
    }
}