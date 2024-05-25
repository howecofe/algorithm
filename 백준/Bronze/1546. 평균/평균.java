import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        double avg = 0;
        
        for (int i = 0; i < n; i++) {
            int score = sc.nextInt();
            avg += score;
            if (max < score) max = score;
        }

        avg /= n;
        avg *= 100 / (double)max;

        System.out.println(avg);
    }
}