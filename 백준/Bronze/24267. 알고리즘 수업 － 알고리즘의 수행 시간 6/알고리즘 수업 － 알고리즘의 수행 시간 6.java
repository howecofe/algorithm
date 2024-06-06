import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long cnt = 0;
        long sum = 0;
        long num = 0;
        
        for (int i = 1; i <= n-2; i++) {
            sum += ++num;
            cnt += sum;
        }

        System.out.println(cnt);
        System.out.println(3);
    }
}