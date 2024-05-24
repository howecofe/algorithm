import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int time = sc.nextInt();

        h = h + time / 60;
        m = m + time % 60;

        if (m >= 60) {
            h = h + m / 60;
            m %= 60;
        }

        if (h >= 24) {
            h %= 24;
        }

        System.out.println(h + " " + m);
    }
}