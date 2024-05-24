import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n = n2;
        
        while (n > 0) {
            System.out.println(n1 * (n % 10));
            n /= 10;
        }
        
        System.out.println(n1 * n2);
    }
}