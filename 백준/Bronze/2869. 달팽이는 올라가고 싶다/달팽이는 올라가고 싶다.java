import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long v = sc.nextLong();

        long day = (long)Math.ceil((double)(v - b) / (a - b));

        System.out.println(day);
    }
}