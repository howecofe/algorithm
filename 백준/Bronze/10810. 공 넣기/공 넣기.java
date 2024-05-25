import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt() + 1];
        int cnt = sc.nextInt();

        for (int i = 0; i < cnt; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int ball = sc.nextInt();

            for (int j = start; j <= end; j++) {
                arr[j] = ball;
            }
        }

        String answer = "";
        for (int i = 1; i < arr.length; i++) {
            answer = answer + arr[i] + " ";
        }

        System.out.println(answer.trim());
    }
}