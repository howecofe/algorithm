import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (b != 0) {
            System.out.println(a / (double)b);
        } else {
            System.out.println(0);
        }
    }
}