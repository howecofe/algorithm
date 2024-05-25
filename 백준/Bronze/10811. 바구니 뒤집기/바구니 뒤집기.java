import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) { arr[i] = i + 1; }

        for (int i = 0; i < m; i++) {
            int left = sc.nextInt() - 1;
            int right = sc.nextInt() - 1;
            List<Integer> list = new ArrayList<>();
            for (int j = right; j >= left; j--) { list.add(arr[j]); }

            int idx = 0;
            for (int j = left; j <= right; j++) { arr[j] = list.get(idx++); }
        }
        
        String answer = "";
        for (int num : arr) {
            answer = answer + num + " ";
        }

        System.out.println(answer.trim());
    }
}