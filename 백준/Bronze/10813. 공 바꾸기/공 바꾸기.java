import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bucketCnt = sc.nextInt();
        int changeCnt = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= bucketCnt; i++) { map.put(i, i); }

        for (int i = 0; i < changeCnt; i++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int tmp = map.get(n1);
            map.put(n1, map.get(n2));
            map.put(n2, tmp);
        }

        String answer = "";
        for (int i = 1; i <= bucketCnt; i++) {
            answer = answer + map.get(i) + " ";
        }

        System.out.println(answer.trim());
    }
}