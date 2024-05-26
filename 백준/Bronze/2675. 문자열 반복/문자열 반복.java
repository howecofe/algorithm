import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int cnt = sc.nextInt();
            String[] str = sc.next().split("");
            String answer = "";
            
            for (String s : str) {
                answer += s.repeat(cnt);
            }

            System.out.println(answer);
        }
    }
}