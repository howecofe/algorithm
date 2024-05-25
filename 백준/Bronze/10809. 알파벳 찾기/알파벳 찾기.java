import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder();

        for (int i = 'a'; i <= 'z'; i++) {
            sb.append(s.indexOf((char) i)).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}