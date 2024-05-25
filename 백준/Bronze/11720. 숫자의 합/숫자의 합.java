import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        String[] nums = sc.next().split("");
        int sum = 0;

        for (int i = 0; i < len; i++) {
            sum += Integer.parseInt(nums[i]);
        }

        System.out.println(sum);
    }
}