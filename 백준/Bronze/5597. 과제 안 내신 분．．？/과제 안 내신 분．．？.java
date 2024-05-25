import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalCnt = 30;
        int submittedCnt = 28;
        int[] arr = new int[totalCnt + 1];

        for (int i = 0; i < submittedCnt; i++) {
            int studentNum = sc.nextInt();
            arr[studentNum]++;
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0) { list.add(i); }
        }

        Collections.sort(list);

        for (int n : list) { System.out.println(n); }
    }
}