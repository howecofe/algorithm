import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> xList = new ArrayList<>();
        List<Integer> yList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            xList.add(sc.nextInt());
            yList.add(sc.nextInt());
        }

        Collections.sort(xList);
        Collections.sort(yList);

        long answer = (long)(xList.get(xList.size() - 1) - xList.get(0)) * (yList.get(yList.size() - 1) - yList.get(0));
        System.out.println(answer);
    }
}