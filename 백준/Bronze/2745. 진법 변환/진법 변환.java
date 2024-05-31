import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());
        String s = sb.reverse().toString();
        int n = sc.nextInt();
        long answer = 0;
        int val = 0;

        for (int i = 0; i < s.length(); i++) {
            if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
                val = s.charAt(i) - 55;
            } else {
                val = s.charAt(i) - '0';
            }

            answer += (long)Math.pow(n, i) * val;
        }

        System.out.println(answer);
    }
}