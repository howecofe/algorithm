import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = 6;
        int[] chess = new int[]{1, 1, 2, 2, 2, 8};
        int[] arr = new int[len];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = chess[i] - sc.nextInt();
        }
        
        String answer = "";
        for (int n : arr) {
            answer += n + " ";
        }

        System.out.println(answer.trim());
    }
}