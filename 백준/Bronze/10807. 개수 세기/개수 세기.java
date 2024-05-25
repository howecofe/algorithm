import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr  = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) { arr[i] = sc.nextInt(); }
        int findNum = sc.nextInt();
        int answer = 0;
        
        for (int n : arr) {
            if (findNum == n) answer++;
        }
        
        System.out.println(answer);
    }
}