import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String origin = sc.next();

        StringBuilder sb = new StringBuilder(origin);
        sb.reverse();

        int answer = origin.equals(sb.toString()) ? 1 : 0;

        System.out.println(answer);
    }
}