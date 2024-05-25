import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();
        long[] arr = new long[len];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLong();
        }

        Arrays.sort(arr);

        System.out.println(arr[0] + " " + arr[arr.length - 1]);
    }
}